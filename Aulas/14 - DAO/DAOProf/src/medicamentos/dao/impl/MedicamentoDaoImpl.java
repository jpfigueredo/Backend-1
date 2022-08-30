package medicamentos.dao.impl;

import medicamentos.dao.ConfiguracaoJDBC;
import medicamentos.dao.IDao;
import medicamentos.model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicamentoDaoImpl implements IDao<Medicamento> {

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(MedicamentoDaoImpl.class);

    public MedicamentoDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Medicamento salvar(Medicamento medicamento) {
        log.debug("Salvando um novo medicamento: " + medicamento.toString());
        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("INSERT INTO medicamentos(nome,laboratorio,quantidade,preco) VALUES('%s','%s','%s','%s')",
                medicamento.getNome(), medicamento.getLaboratorio(), medicamento.getQuantidade(), medicamento.getPreco());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next())
                medicamento.setId(resultSet.getInt(1));

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicamento;
    }
}
