package JavaCore.Module12;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class Genericz {
    public static void main(String[] args) {
        Queue queue = new LinkedList();

        queue.add("Hello");// add String value
        for (int i = 1; i <= 24; i++) {
            queue.add(i);// add 24 Integer values
        }
        queue.add(new Date());// add Date value
        queue.add(new Date());// add one more

        System.out.println(queue);
//        String element = queue.poll();// error: java.lang.Object cannot be converted to java.lang.String
        String element = (String) queue.poll();// casting value of queue to String value and then replace 1st element
        System.out.println(queue);

        //======================

        Queue<String> stringQueue = new LinkedList<>();// collection supports String type only

        stringQueue.add("HIIII");
        stringQueue.add("My name is");

        System.out.println(stringQueue);
        String elmnt = stringQueue.poll();// works without casting
        System.out.println(stringQueue);
    }
}
