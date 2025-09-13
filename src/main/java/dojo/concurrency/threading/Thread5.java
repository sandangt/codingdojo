package dojo.concurrency.threading;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread5 {

    private static AtomicInteger counter = new AtomicInteger(0);

    private static void increment() {
        counter.getAndIncrement();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i=0; i<1000; i++) {
                increment();
            }
        });
       Thread t2 = new Thread(() -> {
           for (int i=0; i<1000; i++) {
               increment();
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

        System.out.println("Counter is: " + counter.get());

    }

}
