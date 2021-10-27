package JavaSourceSobreescrita;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Atleta {
    private int codigo;
    private String nome;
    private String esporte;
    private Double valorPatrocinio;

    public void inserirDados() {
        this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: "));
        this.nome = JOptionPane.showInputDialog("Digite o nome: ");
        this.esporte = JOptionPane.showInputDialog("Digite o esporte praticado: ");
        this.valorPatrocinio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do patrocinio: "));

        String message = "Objeto atleta criado a partir da classe atleta";
        message += "\n Codigo: " + this.codigo;
        message += "\n Nome: " + this.nome;
        message += "\n Esporte: " + this.esporte;

        NumberFormat numberFormat = DecimalFormat.getCurrencyInstance();
        message += "\n Valor do patrocinio: " + numberFormat.format(this.valorPatrocinio);
        JOptionPane.showMessageDialog(null, message);
    }

    public double atualizarValor(double taxa) {
        this.valorPatrocinio = this.valorPatrocinio + taxa;
        return this.valorPatrocinio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public Double getValorPatrocinio() {
        return valorPatrocinio;
    }

    public void setValorPatrocinio(Double valorPatrocinio) {
        this.valorPatrocinio = valorPatrocinio;
    }
}
