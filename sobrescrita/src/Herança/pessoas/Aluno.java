package Herança.pessoas;

public class Aluno extends  Pessoa {
    private String Curso;
    private double[] notas;

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
