package az.idtech.nijat.mitderm2.inheritance;

public class Circle extends Shape {

    private static final double PI = 3.14159265;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
