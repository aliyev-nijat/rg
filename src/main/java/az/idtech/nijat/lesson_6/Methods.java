package az.idtech.nijat.lesson_6;

public class Methods {

    //1.Write a method printGreeting()
    // that prints "Hello, welcome to Java!"
    static void printGreeting() {
        System.out.println("Hello, welcome to Java!");
    }

    //2. Write a method add(int a, int b)
    //that returns the sum of two numbers.
    static int add(int a, int b) {
        return a + b;
    }

    //3. Write a method isEven(int number) that
    //returns true if the number is even, false otherwise.
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    //4.Write a method printTable(int n) that prints the multiplication
    //table of the given number up to 10.
    static void printTable(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

    //5.Write a method max(int a, int b)
    // that returns the larger of two numbers.
    static int max(int a, int b) {
        return a > b ? a : b;
    }

    //6.Write a method isPrime(int number) that returns true if the number is prime.
    static boolean isPrime(int number) {
        if (number == 1) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }

    //7.Write a method factorial(int n)
    // that returns the factorial of a number.
    static int factorial(int n) {
        return n == 1 ? n : n * factorial(n - 1);
    }

    //8.Write a method sumArray(int[] arr)
    // that returns the sum of all elements in the array.
    static int sumArray(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }

        return result;
    }

    //9.Write a method reverseString(String str)
    // that returns the reverse of the given string.
    static String reverseString(String str) {
        if (str == null) return null;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();
    }

    //10.Write a method countVowels(String str)
    // that returns the number of vowels in the string.
    static int countVowels(String str) {
        final char[] vowels = new char[]{
                'a', 'ı', 'o', 'u', 'e', 'ə', 'i', 'ö', 'ü',
                'A', 'I', 'O', 'U', 'E', 'Ə', 'İ', 'Ö', 'Ü',
        };
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int ch : vowels) {
                if (str.charAt(i) == ch) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    //11.Write a method isPalindrome(String str)
    // that returns true if the string is a palindrome.
    static boolean isPalindrome(String str) {
        if (str == null) throw new RuntimeException("Invalid input.");
        if (str.equals("")) return true;
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    //12.Write two versions of a method area():
    //area(int side) → returns area of square
    static int area(int side) {
        return side * side;
    }

    //area(int length, int width) → returns area of rectangle
    static int area(int length, int width) {
        return length * width;
    }

    //13.Write a method average(int... numbers)
    // that returns the average of any number of integers passed.
    static double average(int... numbers) {
        return sumArray(numbers) / (double) numbers.length;
    }

    //14.Write a method
    // celsiusToFahrenheit(double celsius)
    // that converts temperature.
    static double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}
