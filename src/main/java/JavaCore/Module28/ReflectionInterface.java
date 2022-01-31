package JavaCore.Module28;

import java.util.Arrays;
import java.util.HashMap;

public class ReflectionInterface {
    public static void main(String[] args) {
        Object obj = new HashMap<>();
        Class claass = obj.getClass().getSuperclass();
        System.out.println(claass.getSimpleName());

        Class[] interfaces = obj.getClass().getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);
    }
}
