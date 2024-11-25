public class Main {
    public static void main(String[] args) {
        System.out.println("--- Manusia ---");
        Human human = new Human("Andrew");
        human.breathe();
        human.grow();
        human.speak("Saya bukan monyet.");

        System.out.println("\n--- Hewan ---");
        Animal animal = new Animal("Kuda");
        animal.breathe();
        animal.grow();
        animal.move();

        System.out.println("\n--- Tumbuhan ---");
        Plant plant = new Plant("Bayam");
        plant.breathe();
        plant.grow();
        plant.photosynthesize();
    }
}
