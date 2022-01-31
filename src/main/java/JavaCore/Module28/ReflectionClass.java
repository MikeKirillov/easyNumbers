package JavaCore.Module28;

public class ReflectionClass {
    public static void main(String[] args) {
        Object obj = "example";
        Class<?> claass = obj.getClass();

        System.out.println(claass.getName());
        System.out.println(claass.getSimpleName());
    }
}
