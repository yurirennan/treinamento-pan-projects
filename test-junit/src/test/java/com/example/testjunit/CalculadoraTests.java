package com.example.testjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTests {
    @Test
    public void testSomar() {
        System.out.println("Somar");
        int num1 = 5;
        int num2 = 5;

        Calculadora calculadora = new Calculadora();
        double resultadoEsperado = 10.0;
        double resultado = calculadora.somar(num1, num2);

        assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void testSubtrair() {
        System.out.println("Subtrair");
        int num1 = 5;
        int num2 = 3;

        Calculadora calculadora = new Calculadora();
        double resultadoEsperado = 2.0;
        double resultado = calculadora.subtrair(num1, num2);

        assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicação");
        int num1 = 5;
        int num2 = 3;

        Calculadora calculadora = new Calculadora();
        double resultadoEsperado = 15.0;
        double resultado = calculadora.multiplicar(num1, num2);

        assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void testDivisao() {
        System.out.println("Divisão");
        int num1 = 6;
        int num2 = 3;

        Calculadora calculadora = new Calculadora();
        double resultadoEsperado = 2.0;
        double resultado = calculadora.dividir(num1, num2);

        assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void testRestoDivisao() {
        System.out.println("Resto da Divisão");
        int num1 = 5;
        int num2 = 3;

        Calculadora calculadora = new Calculadora();
        double resultadoEsperado = 2.0;
        double resultado = calculadora.resto(num1, num2);

        assertEquals(resultadoEsperado, resultado, 0);
    }
}
