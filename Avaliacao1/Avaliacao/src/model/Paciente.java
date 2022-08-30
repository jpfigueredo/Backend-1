package model;

import java.util.Date;

public class Paciente {

    private Integer id;

    private String nome;
    private String sobrenome;

    @OneToOne
    private Endereco endereco;

    private String rg;
    private Date dataDeAlta;

}
