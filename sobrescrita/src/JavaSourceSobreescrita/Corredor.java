package JavaSourceSobreescrita;

public class Corredor extends Atleta {
    @Override
    public double atualizarValor(double taxa) {
        return super.atualizarValor(2 * taxa);
    }
}
