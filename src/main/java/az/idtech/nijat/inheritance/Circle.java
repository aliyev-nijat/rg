package az.idtech.nijat.inheritance;

public class Circle extends Shape{

    private double r;

    @Override
    public double area() {
        return 3.141 * r * r;
    }
}
