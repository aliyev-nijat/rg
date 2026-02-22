package az.idtech.nijat.exceptions.task4;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("a = ");
            int a = scanner.nextInt();
            System.out.print("b = ");
            int b = scanner.nextInt();
            System.out.printf("%d / %d = %d", a, b, a / b);
        } catch (Exception e) {
            System.out.println("You entered illegal symbol for integer input or divide by zero");
        }
    }
}
