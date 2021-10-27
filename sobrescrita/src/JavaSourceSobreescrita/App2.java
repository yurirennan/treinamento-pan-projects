package JavaSourceSobreescrita;

public class App2 {
    public static void main(String[] args) {
        Atleta atleta = new Atleta();
        atleta.setValorPatrocinio(1000.00);

        Corredor corredor = new Corredor();
        corredor.setValorPatrocinio(1000.00);

        int taxa = 15;
        atleta.atualizarValor(taxa);
        corredor.atualizarValor(taxa);

        System.out.println("Novo salario do Atleta: " + atleta.getValorPatrocinio());
        System.out.println("Novo salario do Corredor: " + corredor.getValorPatrocinio());
    }
}
