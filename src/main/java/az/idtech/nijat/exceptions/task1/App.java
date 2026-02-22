package az.idtech.nijat.exceptions.task1;

import java.util.Scanner;

public class App {

    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        try {
            System.out.printf("%d / %d = %d", a, b, divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero. Try again with another value.");
            main(args);
        }
    }
}
