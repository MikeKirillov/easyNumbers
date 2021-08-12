package JavaCore.Module14;

import JavaCore.Module13.SomeExamples;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private List<String> list1 = new ArrayList<>();
    private List<String> list2 = new ArrayList<>();

    private void addToListOne() {
        synchronized (list1) {// объект блокировки в скобках указывается
            for (int i = 0; i < 100000; i++) {
                list1.add("One");
            }
        }
    }

    private void addToListTwo() {
        synchronized (list2) {// объект блокировки в скобках указывается
            for (int i = 0; i < 100000; i++) {
                list2.add("Two");
            }
        }
    }

    class Process extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 300; i++) {
                addToListOne();
                addToListTwo();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        Thread t1 = worker.new Process();
        Thread t2 = worker.new Process();

        long start = System.currentTimeMillis();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long finish = System.currentTimeMillis();

        System.out.println("list 1 size = " + worker.list1.size());
        System.out.println("list 2 size = " + worker.list2.size());
        System.out.println("Time taken = " + (finish - start) + " ms");
    }
}
