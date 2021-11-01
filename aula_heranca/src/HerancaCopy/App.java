package HerancaCopy;

import Heranca.Carro;
import Heranca.Moto;
import Heranca.Veiculo;

public class App {
    public static void main(String[] args) {
        Veiculo moto = new Moto();
        Veiculo carro = new Carro();

        carro.acelerar();
        carro.frear();

        System.out.println("");
        moto.acelerar();
        moto.frear();
    }
}
