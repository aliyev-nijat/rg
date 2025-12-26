package az.idtech.nijat.dec_16.enum_in_switch;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrafficLight light = TrafficLight.valueOf(scanner.nextLine().toUpperCase());

        switch (light) {
            case TrafficLight.GREEN -> System.out.println("Go");
            case TrafficLight.RED -> System.out.println("Stop");
            case TrafficLight.YELLOW -> System.out.println("Be careful");
        }
    }
}
