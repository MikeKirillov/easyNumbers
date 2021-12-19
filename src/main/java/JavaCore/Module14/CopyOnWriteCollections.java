package JavaCore.Module14;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteCollections {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
        for (int item : list) {
            System.out.print(item + " ");
            list.add(9);
        }

        System.out.println(); // 4 3 52
        System.out.println(list); // 4, 3, 52, 9, 9, 9
        System.out.println("List size: " + list.size()); // 6
    }
}