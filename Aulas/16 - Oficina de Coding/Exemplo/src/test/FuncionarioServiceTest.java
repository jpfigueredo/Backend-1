package test;

import dao.ConfiguracaoJDBC;
import dao.impl.FuncionarioDaoImpl;
import model.Funcionario;
import org.junit.jupiter.api.Test;
import service.FuncionarioService;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioServiceTest {

    private FuncionarioService funcionarioService = new FuncionarioService(new FuncionarioDaoImpl(new ConfiguracaoJDBC()));

    @Test
    public void salvarFuncionario() {
        Funcionario funcionario = new Funcionario("Thiago", "Bellini", "12345678996", "987412255", "Professor", true);
        funcionarioService.salvar(funcionario);
        assertTrue(funcionario.getId() != null);
    }
}