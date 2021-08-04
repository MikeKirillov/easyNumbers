package JavaCore.Module12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ArrList01 {
    public static void main(String[] args) {
        // 1st way to declare ArrayList
        List<String> list = new ArrayList<>();// creating new List with array inside for
        // default 10 values (initial capacity)

        // 2nd way to declare ArrayList
        List<String> list1 = new ArrayList<>(25);// creating new List with array inside for
        // manual declared 25 number of values

        // 3rd way to declare ArrayList
        Queue<String> list2 = new LinkedList<>();// declaring Queue
        list2.add("Johny");
        list2.add("Sam");
        list2.add("Tommy");
        list2.add("Vincenzo");
        list2.add("Pauli");

        List<String> list3 = new LinkedList<>(list2);// declare ArrayList with another (list2) collection inside

        // just an ordinary output
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
