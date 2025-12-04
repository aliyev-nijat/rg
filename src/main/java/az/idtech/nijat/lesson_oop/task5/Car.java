package az.idtech.nijat.lesson_oop.task5;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.startEngine();
    }
}
