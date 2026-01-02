package az.idtech.nijat.mitderm2.exception;

import java.util.Scanner;

public class App {

    static int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Don't divide by zero");
        }

        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        try {
            System.out.printf("%d / %d = %d\n", a, b, divide(a, b));
        } catch (DivideByZeroException e) {
            System.out.println("Can't divide by zero");
            System.out.println("Try again with another value");
            main(args);
        }
    }
}
