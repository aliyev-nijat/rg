package az.idtech.nijat.inheritance;

public class Square extends Shape{

    private double side;

    @Override
    public double area() {
        return side * side;
    }
}
