package JavaCore.Module28;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class ReflectionCallMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {

        HashMap map = new HashMap();
        Class cl = map.getClass();
        Method putMethod = cl.getDeclaredMethod("put", Object.class, Object.class);
        putMethod.invoke(map, "key", "value");

        System.out.println("Values: " + map.toString());
    }
}
