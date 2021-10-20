package br.com.pacote;

import java.lang.reflect.Method;

public class Programa {
    public static void main(String[] args) {
        try {
            Object objeto = Class.forName("br.com.pacote.Pessoa").newInstance();
            Method metodinho = objeto.getClass().getDeclaredMethod("getNome", String.class);

            metodinho.setAccessible(true);

            String nome = (String) metodinho.invoke(objeto, "");

            System.out.println(nome);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
