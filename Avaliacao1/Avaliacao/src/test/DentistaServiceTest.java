package test;

import dao.ConfiguracaoJDBC;
import dao.impl.FilialDaoImpl;
import model.Dentista;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.FilialService;


public class DentistaServiceTest {

    private FilialService filialService = new FilialService(new FilialDaoImpl(new ConfiguracaoJDBC()));

    @Test
    public void salvarFilial(){
//        Dentista dentista1 = new Dentista("Filial 1", "Rua 1", "11345678996", "Cidade 1", "CD 1", true);
//        Dentista dentista2 = new Dentista("Filial 2", "Rua 2", "12345678996", "Cidade 2", "CD 2", true);
//        Dentista dentista3 = new Dentista("Filial 3", "Rua 3", "13345678996", "Cidade 3", "CD 3", true);
//        Dentista dentista4 = new Dentista("Filial 4", "Rua 4", "14345678996", "Cidade 4", "CD 4", true);
//        Dentista dentista5 = new Dentista("Filial  5", "Rua 5", "15345678996", "Cidade 5", "CD 5", true);

//        filialService.salvar(dentista1);
//        filialService.salvar(dentista2);
//        filialService.salvar(dentista3);
//        filialService.salvar(dentista4);
//        filialService.salvar(dentista5);

//        Assertions.assertTrue(dentista1.getId() != null);
//        Assertions.assertTrue(dentista2.getId() != null);
//        Assertions.assertTrue(dentista3.getId() != null);
//        Assertions.assertTrue(dentista4.getId() != null);
//        Assertions.assertTrue(dentista5.getId() != null);
    }

}
