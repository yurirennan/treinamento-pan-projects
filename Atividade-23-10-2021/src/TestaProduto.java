import javax.swing.*;

public class TestaProduto {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código: ")));
        livro.setDescricao(JOptionPane.showInputDialog("Digite a Descrição: "));
        livro.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Produto")));

        livro.exibirDados();
    }
}
