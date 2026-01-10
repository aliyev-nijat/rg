package az.idtech.nijat.exceptions.task6;

import java.util.Objects;
import java.util.Scanner;

public class App {

    static int getHashCode(Object o) {
        Objects.requireNonNull(o);
        return o.hashCode();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object object = null;
        try {
            System.out.printf("Hashcode: %d\n", getHashCode(object));
        } catch (NullPointerException e) {
            System.out.println("Don't use null for argument of getHashCode(Object) method");
        } finally {
            System.out.println("Program ended");
        }
    }
}
