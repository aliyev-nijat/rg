package az.idtech.nijat.dec_19.task_4;

import java.time.LocalDate;

public class App {

    static void compare(LocalDate localDate, LocalDate anotherDate) {
        int difference = localDate.compareTo(anotherDate);
        if (difference > 0) {
            System.out.println("Before");
        }
        else if (difference < 0) {
            System.out.println("After");
        }
        else {
            System.out.println("Equals");
        }
    }

    public static void main(String[] args) {
        compare(LocalDate.now(),LocalDate.of(2025,11,23));
    }
}
