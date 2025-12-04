package az.idtech.nijat.lesson_oop.task1;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Lada";
        car.model = "VAZ2106";
        car.year = 1991;
        System.out.printf("""
                        Brend: %s
                        Model: %s
                        İl: %d""",
                car.brand,
                car.model,
                car.year);
    }
}
