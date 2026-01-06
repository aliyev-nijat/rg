package az.idtech.nijat.general_tasks_for_oop.zoo_simulator;

public class App {

    static void sound(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {
        Animal monkey = new Monkey();
        Animal elephant = new Elephant();
        Animal lion = new Lion();
        sound(monkey);
        sound(elephant);
        sound(lion);
    }
}
