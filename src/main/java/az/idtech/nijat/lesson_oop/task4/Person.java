package az.idtech.nijat.lesson_oop.task4;

public class Person {

    private String name;
    private double height;

    public void print() {
        System.out.printf("""
                Name: %s
                Height: %f
                """,
                name,
                height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
