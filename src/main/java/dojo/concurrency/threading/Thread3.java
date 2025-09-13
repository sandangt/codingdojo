package dojo.concurrency.threading;

public class Thread3 {

    private static final Object LOCK = new Object();

    private static void produce() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("Running the produce function ...");
            LOCK.wait();
            System.out.println("Again in the produce function ...");
        }
    }

    private static void consume() throws InterruptedException {
        Thread.sleep(1000);
        synchronized (LOCK) {
            System.out.println("Running the consume function ...");
            LOCK.notify();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
    }

}
