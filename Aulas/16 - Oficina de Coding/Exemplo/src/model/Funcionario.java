package model;

public class Funcionario {
    private Integer id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private String cargo;
    private Boolean acesso;

    public Funcionario(String nome, String sobrenome, String cpf, String telefone, String cargo, Boolean acesso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cargo = cargo;
        this.acesso = acesso;
    }

    public Funcionario(Integer id, String nome, String sobrenome, String cpf, String telefone, String cargo, Boolean acesso) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cargo = cargo;
        this.acesso = acesso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Boolean getAcesso() {
        return acesso;
    }

    public void setAcesso(Boolean acesso) {
        this.acesso = acesso;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cargo='" + cargo + '\'' +
                ", acesso=" + acesso +
                '}';
    }
}
