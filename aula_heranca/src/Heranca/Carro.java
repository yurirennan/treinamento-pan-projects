package Heranca;

public class Carro extends Veiculo{
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("O carro está parando");
    }
}
