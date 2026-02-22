package az.idtech.nijat.mitderm3.task25;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class App {


    private static int factorial(int n) {
        if (n < 0) throw new RuntimeException();
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            int result = numbers.stream()
                    .map(number -> {
                        Callable<Integer> task = () -> factorial(number);
                        return task;
                    })
                    .map(service::submit)
                    .map(future -> {
                        try {
                            return future.get();
                        } catch (InterruptedException | ExecutionException e) {
                            throw new RuntimeException();
                        }
                    })
                    .reduce(0, Integer::sum);
            System.out.println(result);
        }
    }
}
