import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ConcurrencyAPI {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        List<Callable<Integer>> tasks = new ArrayList<>();
        tasks.add(() -> {
            // task 1 code goes here
            return 1;
        });
        tasks.add(() -> {
            // task 2 code goes here
            return 2;
        });
        tasks.add(() -> {
            // task 3 code goes here
            return 3;
        });
        tasks.add(() -> {
            // task 4 code goes here
            return 4;
        });

        List<Future<Integer>> results = executor.invokeAll(tasks);

        for (Future<Integer> result : results) {
            System.out.println(result.get());
        }

        executor.shutdown();
    }
}

