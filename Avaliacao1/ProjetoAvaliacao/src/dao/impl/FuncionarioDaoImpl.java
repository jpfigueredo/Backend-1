package dao.impl;

import model.Funcionario;
import dao.*;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FuncionarioDaoImpl implements IDao<Funcionario> {

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(FuncionarioDaoImpl.class);

    public FuncionarioDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Funcionario salvar(Funcionario funcionario) {
        log.debug("Salvando funcionário: " + funcionario.toString());

        Connection connection = configuracaoJDBC.conectarDB();
        Statement statement = null;
        String query = String.format("INSERT INTO FUNCIONARIOS(NOME,SOBRENOME,CPF,TELEFONE,CARGO,ACESSO)" +
                        "VALUES ('%s','%s','%s','%s','%s','%s')",
                funcionario.getNome(), funcionario.getSobrenome(), funcionario.getCpf(),
                funcionario.getTelefone(), funcionario.getCargo(), funcionario.getAcesso());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if(resultSet.next()){
                funcionario.setId(resultSet.getInt(1));
            }

            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }


        return funcionario;
    }
}
