package az.idtech.nijat.exceptions.task5;

public class App {

    static int divide(Integer a, Integer b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int result = divide(null, 0);
        } catch (NullPointerException e) {
            System.out.println("Don't use null for arguments of divide method");
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }
    }
}
