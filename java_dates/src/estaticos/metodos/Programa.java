package estaticos.metodos;

public class Programa {
    public static void main(String[] args) {
        System.out.println(Produto.resultado(10, 50));
        System.out.println(new Produto().mudeNomeProduto("Produto"));
        System.out.println(Produto.pegarCpf("  10020030010  "));
    }
}
