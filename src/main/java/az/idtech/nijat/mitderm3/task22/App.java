package az.idtech.nijat.mitderm3.task22;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<String> names = List.of("Ali", "Aysel", "Murad", "Nigar", "Amin");
        Function<String, Character> getFirstLetter = word -> word.charAt(0);

        System.out.println(
                names.stream()

                .collect(Collectors.groupingBy(
                        getFirstLetter,
                        Collectors.mapping(name -> name, Collectors.counting())
                ))
        )
        ;
    }
}
