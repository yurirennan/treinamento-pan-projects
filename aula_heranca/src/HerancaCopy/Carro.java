package HerancaCopy;

import Heranca.Veiculo;

public class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }

    public void iniciando(){
        System.out.println("Iniciando....");
    }

    @Override
    public void frear() {
        System.out.println("O carro está parando");
    }
}
