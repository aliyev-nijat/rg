package az.idtech.nijat.lesson_4;

import java.util.Scanner;

public class ConditionalStatements {

    /*
1. Even or Odd
   - Input: an integer.
   - Output: print whether the number is even or odd.     */
    public static void task1(Scanner scanner) {
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        System.out.println(n % 2 == 0 ? "even" : "odd");
    }

    /*
    2. Positive, Negative, or Zero
   - Input: an integer.
   - Output: print whether it’s positive, negative, or zero.
     */
    public static void task2(Scanner scanner) {
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("negative");
        } else if (n > 0) {
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
    }

    /*
    3. Largest of Two Numbers
   - Input: two integers.
   - Output: print which one is larger (or if they are equal).
     */
    public static void task3(Scanner scanner) {
        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();
        System.out.println(n1 > n2 ? n1 : n2);
    }

    /*
    4. Pass or Fail
   - Input: a student’s score (0–100).
   - Output: “Pass” if score ≥ 50, otherwise “Fail”.
     */
    public static void task4(Scanner scanner) {
        System.out.println("Enter score: ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100) return;
        System.out.println(score >= 50 ? "Pass" : "Fail");
    }

    /*
    5. Check Vowel or Consonant
   - Input: a character.
   - Output: print whether it’s a vowel or consonant.
     */
    public static void task5(Scanner scanner) {
        final char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'ı', 'ə', 'ö', 'ü'};
        System.out.print("Enter letter: ");
        String input = scanner.nextLine();
        if (input.length() != 1) throw new RuntimeException("Invalid input");
        for (char ch : vowels) {
            if (ch == input.charAt(0)) {
                System.out.println("vowel");
                return;
            }
        }
        System.out.println("consonant");
    }

    /*
    6. Leap Year Checker
   - Input: a year.
   - Output: print whether it’s a leap year or not.
     (Hint: Leap year if divisible by 4 but not 100, unless also divisible by 400.)
     */
    public static void task6(Scanner scanner) {
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if (year < 1) throw new RuntimeException("Invalid input");
        boolean i400 = year % 400 == 0;
        boolean i100 = year % 100 == 0;
        boolean i4 = year % 4 == 0;
        boolean isLeap = i400 || (!i100 && i4);
        System.out.println(isLeap ? "leap" : "not leap");
    }

    /*
    7. Grade Calculator
   - Input: score between 0–100.
   - Output:
       90–100 → A
       80–89  → B
       70–79  → C
       60–69  → D
       Below 60 → F
     */
    public static void task7(Scanner scanner) {
        System.out.print("Enter score: ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100) throw new RuntimeException("Invalid input");
        if (score >= 90) System.out.println("A");
        else if (score >= 80) System.out.println("B");
        else if (score >= 70) System.out.println("C");
        else if (score >= 60) System.out.println("D");
        else System.out.println("F");
    }

    /*
    8. Largest of Three Numbers
   - Input: three integers.
   - Output: print the largest number.
     */
    public static void task8(Scanner scanner) {
        System.out.print("Number 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Number 2");
        int n2 = scanner.nextInt();
        System.out.print("Number 3");
        int n3 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println(n1 > n3 ? n1 : n3);
        } else {
            System.out.println(n2 > n3 ? n2 : n3);
        }
    }

    /*
    9. Simple Calculator
    - Input: two numbers and an operator (+, -, *, /).
    - Output: perform the operation and print the result.
      (Use a switch statement.)
     */
    public static void task9(Scanner scanner) {
        System.out.print("First number: ");
        int a = scanner.nextInt();
        System.out.print("Second number: ");
        int b = scanner.nextInt();
        System.out.print("Operator(+,-,/,*): ");
        String op = scanner.nextLine();
        System.out.printf("%d %s %d = %d",
                a,
                op,
                b,
                switch (op) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    case "/" -> a / b;
                    default -> throw new RuntimeException("Invalid operator");
                }
        );
    }

    /*
    10. Day of Week
    - Input: number (1–7).
    - Output: print day name (1 = Monday, 7 = Sunday).
      (Use switch.)
     */
    public static void task10(Scanner scanner) {
        System.out.print("Num of day: ");
        System.out.println(switch (scanner.nextInt()) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new RuntimeException("Invalid input");
        });
    }

    /*
    11. Discount System
    - Input: total purchase amount.
    - Output: apply discounts:
        ≥ 1000 → 20% off
        500–999 → 10% off
     */
    public static void task11(Scanner scanner) {
        System.out.print("Total: ");
        int total = scanner.nextInt();
        if (total <= 0) throw new RuntimeException("Invalid input");
        if (total >= 1000) {
            System.out.println(total * 0.8);
        } else if (total >= 500) {
            System.out.println(total * 0.9);
        } else {
            System.out.println(total);
        }
    }
}
