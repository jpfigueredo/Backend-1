package service;

import dao.IDao;
import model.Funcionario;

public class FuncionarioService {

    private IDao<Funcionario> funcionarioIDao;

    public FuncionarioService(IDao<Funcionario> funcionarioIDao) {
        this.funcionarioIDao = funcionarioIDao;
    }

    public Funcionario salvar(Funcionario funcionario) {
        return funcionarioIDao.salvar(funcionario);
    }

}