package Private;

public class Carro {
    private String nome;

    private void exibirVelocidade(){
        System.out.println("A velocidade de uma " + nome + " é de 380km");
    }

    public static void main(String[] args) {
        Carro c = new Carro();
        c.nome = "Ferrari";
        c.exibirVelocidade();
    }
}
