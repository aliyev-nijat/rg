package az.idtech.nijat.exceptions.task2;

public class App {

    public static void main(String[] args) {
        int[] numbers = new int[]{5, 9, 2, 34, 5};
        try {
            System.out.println(numbers[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Operation is not valid.");
        }
    }
}
