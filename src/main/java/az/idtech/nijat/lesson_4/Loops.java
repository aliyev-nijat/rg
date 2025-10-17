package az.idtech.nijat.lesson_4;

import java.util.Scanner;

public class Loops {

    /*
    1. Print 1 to 10
   - Use a for loop to print numbers from 1 to 10.
     */
    public static void task1() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    /*
    2. Sum of 1 to N
   - Input: an integer N.
   - Output: sum of numbers from 1 to N using a for loop.
     */
    public static void task2(Scanner scanner) {
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        if (n < 0) throw new RuntimeException("Invalid input");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    /*
3. Even Numbers
   - Print all even numbers from 1 to 50 using a for loop.
        */
    public static void task3() {
        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }
    }

    /*
    4. Countdown
   - Use a while loop to print numbers from 10 down to 1.
     */
    public static void task4() {
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    /*
    5. Multiplication Table
   - Input: an integer.
   - Output: print its multiplication table from 1 to 10.
     */
    public static void task5(Scanner scanner) {
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", i, n, i * n);
        }
    }

    /*
    6. Sum of Even and Odd Numbers
   - Input: an integer N.
   - Output:
       - Sum of even numbers from 1 to N.
       - Sum of odd numbers from 1 to N.
     */
    public static void task6(Scanner scanner) {
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) sumEven += i;
            else sumOdd += i;
        }
        System.out.printf("even: %d\nodd: %d", sumEven, sumOdd);
    }

    /*
    7. Factorial
   - Input: an integer N.
   - Output: calculate N! using a for loop.
     */
    public static void task7(Scanner scanner) {
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    /*
    8. Reverse a Number
   - Input: an integer.
   - Output: reverse the digits using a while loop.
     */
    public static void task8(Scanner scanner) {
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        if (n < 0) throw new RuntimeException("Invalid input");
        if (n == 0) {
            System.out.println(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 10);
            n /= 10;
        }
        System.out.println(sb);
    }

    /*
    9. Sum of Digits
    - Input: an integer.
    - Output: sum all digits using a while loop.
     */
    public static void task9(Scanner scanner) {
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        if (n < 0) throw new RuntimeException("Invalid input");
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }

    /*
    10. Prime Number Check
    - Input: an integer.
    - Output: check whether the number is prime using a for loop.
     */
    public static void task10(Scanner scanner) {
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        outerLoop:
        for (int i = 2; i < n; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) continue outerLoop;
            }
            System.out.println(i);
        }
    }

    /*
    11. Nested Loop Pattern – Stars
    - Output:
        *
        **
        ***
        ****
        *****
    - Use nested for loops.
     */
    public static void task11() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0;j < i;j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
