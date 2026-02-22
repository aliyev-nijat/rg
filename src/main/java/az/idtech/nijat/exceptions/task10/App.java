package az.idtech.nijat.exceptions.task10;

import az.idtech.nijat.exceptions.task9.OddNumberException;

import java.util.Scanner;

public class App {

    static void requireEven(int n) throws OddNumberException {
        if (n % 2 == 1) {
            throw new OddNumberException();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter even: ");
        try {
            requireEven(scanner.nextInt());
        } catch (OddNumberException e) {
            System.out.println("Enter even number!");
        }
    }
}
