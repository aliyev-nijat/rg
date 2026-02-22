package az.idtech.nijat.exceptions.task7;

import java.util.Scanner;

public class App {

    static boolean ageValidation(int age) {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException();
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            if (ageValidation(scanner.nextInt())) {
                System.out.println("You can register");
            } else {
                System.out.println("You can't register");
            }
        } catch (InvalidAgeException e) {
            System.out.println("You entered invalid value for age");
        }
    }
}
