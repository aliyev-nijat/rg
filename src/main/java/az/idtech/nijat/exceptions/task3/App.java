package az.idtech.nijat.exceptions.task3;

public class App {

    public static void main(String[] args) {
        String number = "5 ";

        try {
            int intNumber = Integer.parseInt(number);
            System.out.println(intNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid format");
        }
    }
}
