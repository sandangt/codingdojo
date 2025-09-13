package dojo.concurrency.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread10 {

    private static final int VERY_BIG_NUMBER = 1000;

    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            Future<?> future1 = executor.submit(() -> {
                for (int i=0; i<VERY_BIG_NUMBER; i++) {
                    System.out.printf("Runner1: %d%n", i);
                }
            });
            Future<?> future2 = executor.submit(() -> {
                for (int i=0; i<VERY_BIG_NUMBER; i++) {
                    System.out.printf("Runner2: %d%n", i);
                }
            });
            future1.get();
            future2.get();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
