package datas;

import javax.swing.*;
import java.util.Calendar;

public class DataCalendario2 {
    public static void main(String[] args) {
        Calendar calendar = (Calendar) Calendar.getInstance();

        int ano = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o ano de Nascimento"));

        int anoAtual = calendar.get(Calendar.YEAR);

        int idade = anoAtual - ano;

        System.out.println(idade);
    }
}
