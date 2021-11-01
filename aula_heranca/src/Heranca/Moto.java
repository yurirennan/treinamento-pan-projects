package Heranca;

public class Moto extends Veiculo{
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("A moto está parando");
    }
}
