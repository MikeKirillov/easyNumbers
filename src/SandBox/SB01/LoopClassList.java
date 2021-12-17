package SandBox.SB01;

import java.util.ArrayList;
import java.util.List;

public class LoopClassList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        list.add(1); // good form to add String values for Integer like this example use loop
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);

        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }

        System.out.println(list);

        for (Integer i : list) {
            System.out.print(i);
        }
    }
}
