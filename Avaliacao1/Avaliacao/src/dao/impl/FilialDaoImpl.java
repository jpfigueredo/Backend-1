package dao.impl;

import model.Dentista;
import dao.*;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FilialDaoImpl implements IDao<Dentista> {

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(FilialDaoImpl.class);

    public FilialDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Dentista salvar(Dentista dentista) {
        log.debug("Salvando filial: " + dentista.toString());

        Connection connection = configuracaoJDBC.conectarDB();
        Statement statement = null;
        String query = String.format("INSERT INTO FILIAL(nomeFilial,rua,numero,cidade,estado,ehCincoEstrelas)" +
                        "VALUES ('%s','%s','%s','%s','%s','%s')",
                dentista.getNomeFilial(), dentista.getRua(), dentista.getNumero(),
                dentista.getCidade(), dentista.getEstado(), dentista.getEhCincoEstrelas());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if(resultSet.next()){
                dentista.setId(resultSet.getInt(1));
            }

            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }


        return dentista;
    }
}
