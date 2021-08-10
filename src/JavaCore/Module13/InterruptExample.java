package JavaCore.Module13;

import java.util.function.DoubleToIntFunction;

public class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
        Thread threadToInterrupt = new Thread() {
            @Override
            public void run() {
                while(true) {
                    System.out.println("working hard");

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
//                        System.out.println("interrupted");
//                        break;
                    }
                }
            }
        };

        threadToInterrupt.start();
        Thread.currentThread().sleep(2500);
        threadToInterrupt.interrupt();
        threadToInterrupt.join();
        System.out.println("thread finished");
    }
}
