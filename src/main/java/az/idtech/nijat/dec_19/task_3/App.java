package az.idtech.nijat.dec_19.task_3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class App {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        Month month = now.getMonth();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(year);
        System.out.println(month);
        System.out.println(dayOfWeek);
    }
}
