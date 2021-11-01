package Sobrecarga;

public class Produtor {
    private double conta;
    private String nome;

    public Produtor(double conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Produtor prod = new Produtor(50, "yuri");

        System.out.println(prod.getConta());
    }
}
