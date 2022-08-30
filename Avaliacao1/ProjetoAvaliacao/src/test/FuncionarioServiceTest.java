package test;

import dao.ConfiguracaoJDBC;
import dao.impl.FuncionarioDaoImpl;
import model.Funcionario;
import service.FuncionarioService;


public class FuncionarioServiceTest {

    private FuncionarioService funcionarioService = new FuncionarioService(new FuncionarioDaoImpl(new ConfiguracaoJDBC()));

    @Test
    public void salvarFuncionario(){
        Funcionario funcionario = new Funcionario("Thiago", "Bellini", "12345678996", "987654321", "Professor", true);

        funcionarioService.salvar(funcionario);

        Assertions.assertTrue(funcionario.getId() != null);
    }

}
