package Herança.animais;

public class Programa {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.dormir();
        gato.peso = 7.0;
        gato.raca = "Siameses";

        System.out.println("Sobre o gato");
        System.out.println(gato.peso);

        Cachorro cachorro = new Cachorro();
        cachorro.dormir();
        cachorro.peso = 12.0;
        cachorro.raca = "Labrador";

        System.out.println("Sobre o cachorro");
        System.out.println(cachorro.peso);
    }
}
