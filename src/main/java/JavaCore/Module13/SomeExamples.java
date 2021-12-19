package JavaCore.Module13;

public class SomeExamples {
//    public static void main(String[] args) {
//        Thread currentThread = Thread.currentThread();
//        ThreadGroup groupThread = currentThread.getThreadGroup();
//
//        System.out.println("Thread: " + currentThread.getName());
//        System.out.println("Thread group: " + groupThread.getName());
//        System.out.println("Thread parent group: " + groupThread.getParent().getName());
//    }

    // 1st way to create a thread
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
    }
}