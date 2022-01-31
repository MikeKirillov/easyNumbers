package JavaCore.Module28;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

public class ReflectionConstructor {
    public static void main(String[] args) throws NoSuchMethodException {
        Object map = new HashMap<>();

        Constructor[] constructors = map.getClass().getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);

        System.out.println();

        Field[] fields = map.getClass().getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);

        System.out.println();

        Method[] methods = map.getClass().getDeclaredMethods();
        Arrays.stream(methods).forEach(System.out::println);
    }
}
