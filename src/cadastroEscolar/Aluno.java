package cadastroEscolar;

import java.util.List;

public class Aluno implements Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;
    private int numeroMatricula;
    private Telefone telefone;

    public Aluno(String nome, String cpf, String email, Endereco endereco, Telefone telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
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

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return
                "Nome='" + nome + '\'' +
                ", Número da Matrícula= " + numeroMatricula
                ;
    }
}


