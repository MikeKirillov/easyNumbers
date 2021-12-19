package JavaCore.Module12;

import java.util.*;

public class HashSet01 {
    public static void main(String[] args) {
        // 1st way to declare HashSet
        Set<String> set1 = new HashSet<>();// creates an empty set with hashMap inside with
        // default value length - 16
        // and 0.75 load factor (coefficient of filling)

        // 2nd way to declare HashSet
        Set<String> set2 = new HashSet<>(25);// creates an empty set with hashMap inside with
        // manual declared value of length - 25
        // and 0.75 load factor (coefficient of filling)

        // 3rd way to declare HashSet
//        Set<String> set3 = new HashSet<>(25, 0.9);// creates an empty set with hashMap inside with
        // manual declared value of length - 25
        // and 0.9 manual declared value of load factor (coefficient of filling)

        // 4th way to declare HashSet
        List<String> list = new ArrayList<>();// creating collection

        list.add("Sam");
        list.add("Mary");
        list.add("Mike");
        list.add("Alex");
        list.add("Dmitri");

        Set<String> set4 = new HashSet<>(list);// create set with values of 1st created collection inside
    }
}
