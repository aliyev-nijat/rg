package az.idtech.nijat.mitderm3.task24;

import java.util.List;

public class App {

    public static List<Integer> evenNumbers(List<Integer> nums) {
        return nums.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .toList();
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        System.out.println(evenNumbers(nums));
    }
}
