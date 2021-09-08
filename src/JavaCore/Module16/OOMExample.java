package JavaCore.Module16;

import java.util.LinkedList;
import java.util.List;

public class OOMExample {
    public static void main(String[] args) {
        // создадим список, ссылающийся на
        // 100 массивов размером 1Mb
        List<Object> objects = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            objects.add(new byte[1024 * 1024]);// change to 1024444 * 1024444 to get java.lang.OutOfMemoryError
        }
        System.out.println("Success!");
    }
}
