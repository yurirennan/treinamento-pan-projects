import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Livro extends Produto {
    public void exibirDados() {
        NumberFormat numberFormat = new DecimalFormat("###,#0.00");
        System.out.println("Codigo: " + getCodigo() + "\nDescrição: " + getDescricao() + "\nPreço: R$" + numberFormat.format(getPreco()));
    };
}
