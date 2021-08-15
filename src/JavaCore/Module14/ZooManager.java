package JavaCore.Module14;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class ZooManager {// Использование коллекций в многопоточном приложении
    // 1st way to write multi-thread code with Collections
//    private Map<String, Object> foodData = new HashMap<>();
//
//    public synchronized void put(String key, Object value) {
//        foodData.put(key, value);
//    }
//
//    public synchronized Object get(String key) {
//        return foodData.get(key);
//    }

    // 2nd way to write multi-thread code with Collections
//    private Map<String, Object> foodData = new ConcurrentHashMap<>();
//
//    public void put(String key, Object value) {
//        foodData.put(key, value);
//    }
//
//    public Object get(String key) {
//        return foodData.get(key);
//    }
    // works good


    // Ошибки при работе с памятью
    // 1st way to write multi-thread code with Collections. Memory problems
//    public static void main(String[] args) {
//        Map<String, Object> foodData = new HashMap<>();
//        foodData.put("penguin", 1);
//        foodData.put("flamingo", 2);
//        for (String key : foodData.keySet()) {
//            foodData.remove(key);
//        }
//        // Exception in thread "main" java.util.ConcurrentModificationException
//    }
    // 2nd way to write multi-thread code with Collections. Memory problems
//    public static void main(String[] args) {
//        Map<String, Object> foodData = new ConcurrentHashMap<>();
//        foodData.put("penguin", 1);
//        foodData.put("flamingo", 2);
//        for (String key : foodData.keySet()) {
//            foodData.remove(key);
//        }
//        // works good
//    }

    // Блокирующие коллекции
    public static void main(String[] args) {
        try {
            BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

            blockingQueue.offer(39);
            blockingQueue.offer(3,4, TimeUnit.SECONDS);// добавление с ожиданием доступного места
            // (если очередь фиксированной длины)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
            blockingDeque.offer(91);
            blockingDeque.offerFirst(5,2,TimeUnit.MINUTES);// добавление в начало с ожиданием доступного места
            // (если очередь фиксированной длины)
            blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);// добавление в конец с ожиданием доступного места
            // (если очередь фиксированной длины)
            blockingDeque.offer(3, 4, TimeUnit.SECONDS);// добавление в конец с ожиданием доступного места
            // (если очередь фиксированной длины)

            System.out.println(blockingDeque.poll());
            System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));// удаление с начала с ожиданием пока
            // требуемый элемент не станет доступным
            System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS)); // удаление с начала с ожиданием пока
            // требуемый элемент не станет доступным
            System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));// удаление с конца с ожиданием пока
            // требуемый элемент не станет доступным
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}