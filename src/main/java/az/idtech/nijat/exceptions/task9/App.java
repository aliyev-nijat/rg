package az.idtech.nijat.exceptions.task9;

public class App {

    static void method1() {
        try {
            method2();
        } catch (RuntimeException e) {
            System.out.println("Exception!");
        }
    }

    static void method2() {
        method3();
    }

    static void method3() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        method1();
    }
}
