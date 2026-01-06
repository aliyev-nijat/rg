package az.idtech.nijat.dec_16.func_interface;

public class App {

    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator multi = (a, b) -> a * b;

        System.out.println(add.operate(5.0, 4.0));
        System.out.println(multi.operate(9.0, 3.0));
    }
}
