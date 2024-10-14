package dojo.threading;

public class Thread2 {

    private static int counter = 0;
    private static final int SOME_UPPER_NUM = 2000;
    private static final Object LOCK = new Object();

    private static void increment() {
        synchronized (LOCK) {
            counter++;
        }
    }

    private static void decrement() {
        synchronized (LOCK) {
            counter--;
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
