package JavaCore.Module13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOneThread {
    public static void main(String[] args) throws InterruptedException {
        // part 01. максимум в массиве чисел из 10 миллионов элементов
        Thread maxValue = new Thread() {// anonymous inner class Thread
            @Override
            public void run() {
                List<Integer> numbers = new ArrayList<>();

                for (int i = 0; i <= 10000000; i++) {
                    numbers.add(i);
                }

                int max = Collections.max(numbers);
                System.out.println("Max value is found: " + max);
            }
        };

        // part 02. сортирует другой массив чисел, заполненный от 10 миллионов до 1
        Thread sortedList = new Thread() {// anonymous inner class Thread
            @Override
            public void run() {
                List<Integer> unsorted = new ArrayList<>();

                for (int i = 10000000; i >= 1; i--) {
                    unsorted.add(i);
                }

                Collections.sort(unsorted);
                System.out.println("Collections sorted for now");
            }
        };

        // part 03. убирает все элементы с последнего индекса из ArrayList, содержащего 10 миллионов чисел
        Thread listed = new Thread() {// anonymous inner class Thread
            @Override
            public void run() {
                List<Integer> list = new ArrayList<>();

                for (int i = 0; i <= 10000000; i++) {
                    list.add(i);
                }
                while (list.size() != 0) {
                    list.remove(list.size() - 1);
                }
                System.out.println("List is clear");
            }
        };

        // total timing check
        long start = System.currentTimeMillis();

        maxValue.start();
        sortedList.start();
        listed.start();

        maxValue.join();
        sortedList.join();
        listed.join();

        long end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start) + " ms");
    }
}
