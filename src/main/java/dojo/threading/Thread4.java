package dojo.threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Thread4 {

    private static int counter = 0;
    private static final int SOME_UPPER_NUM = 2000;
    private static final Lock LOCK = new ReentrantLock();

    private static void increment() {
        LOCK.lock();
        try {
            counter++;
        } finally {
            LOCK.unlock();
        }
    }

    private static void decrement() {
        LOCK.lock();
        try {
            counter--;
        } finally {
            LOCK.unlock();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i=0; i<SOME_UPPER_NUM; i++) {
                increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i=0; i<SOME_UPPER_NUM; i++) {
                decrement();
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
        System.out.printf("The counter is: %d%n", counter);

    }
}
