package estaticos.atributos;

public class Programa {

    public static void main(String[] args) {

        // nao precisa inicializar
        Time.professor= "Master Coach Gilberto";
        //Time.aluno = "Julia";

        Time atleta1_do_time = new Time();
        atleta1_do_time.atleta = "Julia";
        System.out.println("atleta:" + atleta1_do_time.atleta);
        System.out.println("Coach:" + atleta1_do_time.professor);

        Time atleta_do_time = new Time();
        atleta_do_time.atleta = "Yuri";
        System.out.println("Atleta: " + atleta_do_time.atleta);
        System.out.println("Tecnico: " + atleta_do_time.professor);

    }

}
