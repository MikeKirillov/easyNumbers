package JavaCore.Module14;

public class Deadlocks implements Runnable {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Deadlocks deadlocks = new Deadlocks();
        deadlocks.doTask1();
        deadlocks.doTask2();
    }

    @Override
    public void run() {
        doTask1();
        doTask2();
    }

    private void doTask1() {
        synchronized (lock1) {
//            synchronized (lock2) {
                System.out.println("doing task 1");
//            }
        }
    }

    private void doTask2() {
        synchronized (lock2) {
//            synchronized (lock1) {
                System.out.println("doing task 2");
//            }
        }
    }
}
