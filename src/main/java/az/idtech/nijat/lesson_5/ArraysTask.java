package az.idtech.nijat.lesson_5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTask {

    /*
    1. Sum of Elements
   - Input: {10, 20, 30, 40}
   - Output: 100
   */
    public static void task1(Scanner scanner) {
        System.out.print("Enter size of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        System.out.println(sum);
    }

    /*
   2. Find Maximum and Minimum
   - Input: {5, 2, 9, 1, 7}
   - Output: Max = 9, Min = 1
   */
    public static void task2(Scanner scanner) {
        System.out.print("Enter size of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int item : array) {
            min = item < min ? item : min;
            max = item > max ? item : max;
        }
        System.out.printf("max = %d\nmin = %d", max, min);
    }

    /*
   3. Count Even and Odd Numbers
   - Input: {3, 4, 6, 7, 9, 12}
   - Output: Even = 3, Odd = 3
   */
    public static void task3(Scanner scanner) {
        System.out.print("Enter size of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = scanner.nextInt();
        }
        int countEven = 0;
        for (int item : array) {
            if (item % 2 == 0) countEven++;
        }
        System.out.printf(
                "even: %d\nodd: %d",
                countEven,
                array.length - countEven
        );
    }

    /*
   4. Reverse an Array
   - Input: {1, 2, 3, 4, 5}
   - Output: {5, 4, 3, 2, 1}
    */
    public static void task4(Scanner scanner) {
        System.out.print("Enter size of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int otherIndex = array.length - i - 1;
            array[i] += array[otherIndex];
            array[otherIndex] = array[i] - array[otherIndex];
            array[i] = array[i] - array[otherIndex];
        }
        System.out.println(Arrays.toString(array));
    }

    /*
    5. Search Element
   - Task: Ask the user for a number and check if it exists in the array.
    */
    public static void task5(Scanner scanner) {
        System.out.print("Enter size of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        for (int item : array) {
            if (item == n) {
                System.out.println("exists");
                return;
            }
        }
        System.out.println("not exists");
    }

    /*
    6. Copy Array
   - Task: Copy all elements from one array to another.
   */
    public static void task6(Scanner scanner) {
        System.out.print("Enter size of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = scanner.nextInt();
        }
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
    }
}
