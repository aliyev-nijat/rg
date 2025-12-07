package az.idtech.nijat.mitderm1;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    static void checkAdult() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("You are underage");
        } else if (age < 65) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }

    static void calculateForArray() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d] = ", i);
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int n : numbers) {
            sum += n;
            min = n < min ? n : min;
            max = n > max ? n : max;
        }

        System.out.printf("""
                        Avarage: %f
                        Maximum: %d
                        Minumum: %d
                        """,
                sum / (double) numbers.length,
                max,
                min
        );
    }

    static String cleanText(String s) {
        s = s.trim()
                .toLowerCase()
                .replaceAll("\\d+", "");
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (flag || s.charAt(i) != ' ') {
                stringBuilder.append(s.charAt(i));
            }
            if (s.charAt(i) == ' ') {
                flag = false;
            } else {
                flag = true;
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
    }
}
