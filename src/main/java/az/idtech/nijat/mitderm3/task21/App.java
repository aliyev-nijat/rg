package az.idtech.nijat.mitderm3.task21;

import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> nums = List.of(3, 10, 15, 20, 7, 8);
        System.out.println(
                nums.stream()
                        .filter(n -> n % 2 == 1)
                        .map(n -> n * 3)
                        .sorted((a, b) -> b - a)
                        .toList()
        );

    }
}
