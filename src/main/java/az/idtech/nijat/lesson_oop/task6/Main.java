package az.idtech.nijat.lesson_oop.task6;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.printf("""
                        Perimeter: %f
                        Area: %f
                        """,
                rectangle.getPerimeter(),
                rectangle.getArea());
    }
}
