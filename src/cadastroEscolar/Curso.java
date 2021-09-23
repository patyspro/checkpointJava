package cadastroEscolar;

import java.util.List;

public class Curso {
    private Disciplina disciplina;
    private double valorMensal;

    public Curso(Disciplina disciplina, double valorMensal) {
        this.disciplina = disciplina;
        this.valorMensal = valorMensal;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "disciplina=" + disciplina +
                ", valorMensal=" + valorMensal
                ;
    }
}
