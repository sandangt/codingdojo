package dojo.concurrency.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread8 {

    private static class Caller implements Callable<String> {

        private final int id;

        public Caller(int id) {
            this.id = id;
        }

        @Override
        public String call() throws Exception {
            Thread.sleep(1000);
            return "id: %d".formatted(id);
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Future<String>> futureList = new ArrayList<>();
        for (int i=0; i<5; i++) {
            Future<String> future = executor.submit(new Caller(i));
            futureList.add(future);
        }
        for (var future : futureList) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException ex) {
                ex.printStackTrace();
            }
        }
        executor.shutdown();
    }

}
