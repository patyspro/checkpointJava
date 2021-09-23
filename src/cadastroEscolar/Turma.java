package cadastroEscolar;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private int matricula = 0 ;
    private Turno turno;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor professor;
    private String nomeSala;
    private Curso curso;

    public Turma(Turno turno, Professor professor, String nomeSala, Curso curso) {
        this.turno = turno;
        this.professor = professor;
        this.nomeSala = nomeSala;
        this.curso = curso;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void insereAluno(Aluno aluno){
        matricula++;
        aluno.setNumeroMatricula(matricula);
        this.alunos.add(aluno);
    }

    @Override
    public String toString() {
        return "Nome da Sala = " + nomeSala +
                ", Turno= " + turno +
                ", Professor= " + professor.getNome() +
                ", Alunos= " + alunos+
                ", Curso= " + curso.getDisciplina()
                ;
    }
}
