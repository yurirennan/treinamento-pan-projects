package Sobrecarga;

public class App {
    static int somando(int x, int y) {
        return x + y;
    }

    static double somando(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int number1 = somando(3, 2);
        double number2 = somando(3.3, 2.7);

        System.out.println(number1);
        System.out.println(number2);
        double valor = 150;

    }

}
