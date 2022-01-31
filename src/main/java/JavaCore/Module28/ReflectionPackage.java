package JavaCore.Module28;

import java.util.Arrays;

public class ReflectionPackage {
    public static void main(String[] args) {
        Object obj = 5;
        Class claass = obj.getClass();
        Package classPackage = claass.getPackage();
        System.out.println(classPackage.getName()); // Integer is at java.lang
        System.out.println(Arrays.toString(classPackage.getAnnotations()));
    }
}
