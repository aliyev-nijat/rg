package az.idtech.nijat.mitderm3.task23;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            IntStream.range(1, 6)
                    .mapToObj(number -> {
                        Callable<Integer> task = () -> number * number;
                        return task;
                    })
                    .map(service::submit)
                    .forEach(future -> {
                        try {
                            System.out.println(future.get());
                        } catch (InterruptedException | ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                    });
        }
    }
}
