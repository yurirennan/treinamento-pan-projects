import java.util.ArrayList;

public class ArrayFor {
    public static void main(String[] args) {
        ArrayList<String> pessoas= new ArrayList<>();

        pessoas.add("Luiza");
        pessoas.add("Luiz");
        pessoas.add("Jnaete");

        System.out.println("--------------------------------");
        for (String pessoa : pessoas) {
            System.out.printf("Posição %s\n", pessoa);
        }

        System.out.println("----------Começa-Com-L-------------");
        for (String pessoa : pessoas) {
            if (pessoa.charAt(0) == 'L') {
                System.out.printf("Posição %s\n", pessoa);
            }
        }

        System.out.println("----------Pessoas e indices-------------");
        int i = 0;
        for (String pessoa: pessoas) {
            System.out.printf("Posição %d - %s\n", i, pessoa);
            i++;
        }

    }
}
