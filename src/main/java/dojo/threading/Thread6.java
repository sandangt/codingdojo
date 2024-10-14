package dojo.threading;

import java.util.concurrent.Semaphore;

public class Thread6 {
    private static final Semaphore semaphore = new Semaphore(3, true);

    private static void doSomething() {
        try {
            semaphore.acquire();
            System.out.printf("%s is doing something%n", Thread.currentThread().getName());
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            System.out.printf("%s releases semaphore%n", Thread.currentThread().getName());
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i=0; i<100; i++) {
                doSomething();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i=0; i<100; i++) {
                doSomething();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
