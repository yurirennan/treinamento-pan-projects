package com.example.testjunit;

public class Calculadora {
    private int resultado;

    public double somar(int num1, int num2) {
        resultado = num1 + num2;
        return resultado;
    }

    public double subtrair(int num1, int num2) {
        resultado = num1 - num2;
        return resultado;
    }

    public double multiplicar(int num1, int num2) {
        resultado = num1 * num2;
        return resultado;
    }

    public double dividir(int num1, int num2) {
        resultado = num1 / num2;
        return resultado;
    }

    public double resto(int num1, int num2) {
        resultado = num1 % num2;
        return resultado;
    }

}
