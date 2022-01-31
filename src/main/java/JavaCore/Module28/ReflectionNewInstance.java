package JavaCore.Module28;

import java.awt.event.WindowStateListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class ReflectionNewInstance {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<?> cl = Class.forName("java.util.HashMap");
        Constructor<?> constructor = cl.getConstructor();
        HashMap map = (HashMap) constructor.newInstance();

        System.out.println(map.getClass().getSimpleName());
        System.out.println(map.isEmpty());

        System.out.println();

        // not good experience. use carefully
        HashMap map1 = new HashMap();
        Class<?> cl1 = map1.getClass();

        HashMap instance = (HashMap) cl1.getConstructor().newInstance();
        Field field = instance.getClass().getDeclaredField("size");
        field.setAccessible(true);
        field.setInt(instance, 10);

        System.out.println("Map is empty: " + instance.isEmpty());
        System.out.println("Map size: " + instance.size());
//        System.out.println("Values: " + instance.values());
        System.out.println("Values: " + instance.toString());
    }
}
