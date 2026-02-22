package az.idtech.nijat.exceptions.task8;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        if (scanner.nextInt() < 18) {
            throw new InvalidAgeException();
        }
    }
}
