package dojo.concurrency.threading;

public class Thread9 {

    private static final int VERY_BIG_NUMBER = 1000;

    public static void main(String[] args) throws InterruptedException {
        Runnable runner1 = () -> {
            for (int i=0; i<VERY_BIG_NUMBER; i++) {
                System.out.printf("Runner1: %d%n", i);
            }
        };
        Runnable runner2 = () -> {
            for (int i=0; i<VERY_BIG_NUMBER; i++) {
                System.out.printf("Runner2: %d%n", i);
            }
        };
        Thread t1 = Thread.ofVirtual().start(runner1);
        Thread t2 = Thread.startVirtualThread(runner2);
        t1.join();
        t2.join();
    }

}
