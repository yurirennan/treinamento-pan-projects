package estaticos.metodos;

public class Produto {
    public static int resultado(int arroz, int feijao) {
        return arroz + feijao;
    }

    public String mudeNomeProduto(String nomeProduto) {
        return nomeProduto;
    }

    public static String pegarCpf(String cpf) {
        String tratei = cpf.strip();
        return tratei;
    }
}
