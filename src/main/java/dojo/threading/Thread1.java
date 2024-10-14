package dojo.threading;

public class Thread1 {

    private static final int SOME_UPPER_NUM = 10;
    private static final int VERY_SLOW_SLEEP_TIME = 2000;
    private static final int SLOW_SLEEP_TIME = 500;
    private static final int FAST_SLEEP_TIME = 100;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner1());
        Thread t2 = new Runner2();
        Thread t3 = new Thread(() -> {
            for (int i = 0; i< SOME_UPPER_NUM; i++) {
                try {
                    Thread.sleep(SLOW_SLEEP_TIME);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.printf("Runner3: %d%n", i);
            }
        });
        Thread t4 = new Thread(new Runner4());
        t4.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Finished all");
    }

    private static class Runner1 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i< SOME_UPPER_NUM; i++) {
                try {
                    Thread.sleep(FAST_SLEEP_TIME);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.printf("Runner1: %d%n", i);
            }
        }
    }

    private static class Runner2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i< SOME_UPPER_NUM; i++) {
                try {
                    Thread.sleep(FAST_SLEEP_TIME);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.printf("Runner2: %d%n", i);
            }
        }
    }

    private static class Runner4 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i< SOME_UPPER_NUM; i++) {
                try {
                    Thread.sleep(VERY_SLOW_SLEEP_TIME);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.printf("Runner4: %d%n", i);
            }
        }
    }
}
