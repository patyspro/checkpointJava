package cadastroEscolar;

import java.util.List;

public class Professor {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;
    private Telefone telefone;
    private double valorHora;
    private Formacao tipo;

    public Professor(int id, String nome, String cpf, String email, Endereco endereco, Telefone telefone, double valorHora, Formacao tipo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.valorHora = valorHora;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Formacao getTipo() {
        return tipo;
    }

    public void setTipo(Formacao tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                ", telefone=" + telefone +
                ", valorHora=" + valorHora +
                ", tipo=" + tipo +
                '}';
    }
}
