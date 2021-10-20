package br.com.pacote;

public class Pessoa {
    private String name = "Yuri";

    private String getNome(String visitanteNome){
        System.out.println("Quem é??... " + visitanteNome);
        return name;
    }
}
