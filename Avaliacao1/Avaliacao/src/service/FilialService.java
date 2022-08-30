package service;

import dao.IDao;
import model.Dentista;

public class FilialService {

    private IDao<Dentista> filialIDao;

    public FilialService(IDao<Dentista> filialIDao) {
        this.filialIDao = filialIDao;
    }

    public Dentista salvar(Dentista dentista){
        return filialIDao.salvar(dentista);
    }



}
