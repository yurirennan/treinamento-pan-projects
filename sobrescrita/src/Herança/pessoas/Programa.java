package Herança.pessoas;

public class Programa {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        aluno.setNome("Aluno");
        aluno.setCurso("Curso");

        System.out.println(aluno.getCurso());
        System.out.println(aluno.getNome());

        professor.setSalario(1000.00);
    }
}
