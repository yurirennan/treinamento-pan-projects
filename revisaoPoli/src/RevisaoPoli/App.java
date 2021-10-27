package RevisaoPoli;

public class App {
    public void fazerAnimalComer(Animal animal) {
        animal.comer();
    }

    public static void main(String[] args) {

        App app = new App();
        app.fazerAnimalComer(new Animal());
        app.fazerAnimalComer(new Cachorro());
        app.fazerAnimalComer(new Leao());
    }
}
