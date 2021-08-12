package JavaCore.Module13;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class TwoThreats {
    private static ArrayBlockingQueue queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
        // 1st thread
        Thread thread01 = new Thread() {
            @Override
            public void run() {
                try {
                    Random random = new Random();
                    while (true) {
                        queue.put(random.nextInt(100));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // 2nd thread
        Thread thread02 = new Thread() {
            @Override
            public void run() {
                try {
                    Random random = new Random();
                    int rand = 0;
                    while (true) {
                        Thread.sleep(100);
                        rand = random.nextInt(10);
                        if (rand == 5) {
                            System.out.println("1st threat " + queue.take());
                            System.out.println("2nd threat " + rand);
                            System.out.println("Queue size " + queue.size());
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // starting both threads
        thread01.start();
        thread02.start();

        thread01.join();
        thread02.join();
    }
}
