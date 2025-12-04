package az.idtech.nijat.lesson_oop.task5;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(75);
        Car car = new Car(engine);
        car.startCar();
    }
}
