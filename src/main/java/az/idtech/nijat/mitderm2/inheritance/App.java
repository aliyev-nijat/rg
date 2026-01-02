package az.idtech.nijat.mitderm2.inheritance;

import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        shapes.add(new Rectangle(5.2, 6.4));
        shapes.add(new Circle(5.0));
        shapes.forEach(shape -> {
            System.out.println(shape.area());
        });
    }
}
