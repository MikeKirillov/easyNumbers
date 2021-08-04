package JavaCore.Module12.GenericCrate;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Crate<Elephant> crateForElephant = new Crate<Elephant>(); // создали клетку для слона
        Crate<Monkey> crateForMonkey = new Crate<Monkey>(); // и клетку для обезьяны
        Crate<Wolf> crateForWolf = new Crate<Wolf>(); // и клетку для волка
        // как видите, нам не потребовалось определять каждый раз новый класс для клеток
        Elephant elephant = crateForElephant.getContents();
        Monkey monkey = crateForMonkey.getContents();
        Wolf wolf = crateForWolf.getContents();

//        crateForElephant.setContents(new Wolf()); // compile error
    }

    //    public static void mainz(String[] args) {
//        Queue<String> keywords = new LinkedList<>();
//        keywords.add("Java");
////        printList(keywords); // не компилируется
//    }
//
//    private static void printList(Queue<Object> keywords) {
//        for (Object o : keywords) {
//            System.out.println(o);
//        }
//    }
    public static void mainz(String[] args) {
        Queue<String> keywords = new LinkedList<>();
        keywords.add("Java");
        printList(keywords); // не компилируется
    }

    private static void printList(Queue<?> keywords) {// <Object> replaced by <?> also known as WILDCARD
        for (Object o : keywords) {
            System.out.println(o);
        }
    }

    public static long total(List<? extends Number> list) {// using upper-bounded wildcard
        long count = 0;
        for (Number number : list) {
            count += number.longValue();
        }
        return count;
    }

    public static void addSound(List<? super String> list) {// using lower-bounded wildcard
        list.add("Meow");
    }
}

class Elephant {
}

class Monkey {
}

class Wolf {
}
