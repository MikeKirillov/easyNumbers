package JavaCore.Module14.Atomicz;

import java.util.concurrent.atomic.AtomicInteger;

public class App2 {
    private AtomicInteger count = new AtomicInteger(0);// используем новый класс AtomicInteger

    public static void main(String[] args) throws InterruptedException {
        App2 app = new App2();// строка 1
        app.doWork();
    }

    private void doWork() throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    count.incrementAndGet();
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    count.incrementAndGet();
                }
            }
        };

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count is: " + count);// Count is: 20000
    }
}
