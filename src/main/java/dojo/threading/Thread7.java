package dojo.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Thread7 {

    private static class Task implements Runnable {

        private final int id;

        public Task(int id) {
            this.id = id;
        }
        @Override
        public void run() {
            System.out.printf("Task with id %d and thread id %s is in work%n", id, Thread.currentThread().getName());
            long duration = (long) (Math.random() * 5);
            try {
                TimeUnit.SECONDS.sleep(duration);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int i=0; i<5; i++) {
            executor.execute(new Task(i));
        }
        executor.shutdown();
    }
}
