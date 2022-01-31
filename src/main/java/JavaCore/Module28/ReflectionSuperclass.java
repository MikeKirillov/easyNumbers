package JavaCore.Module28;

public class ReflectionSuperclass {
    public static void main(String[] args) {
        String str = "string";
        Class claass = str.getClass().getSuperclass();

        System.out.println(claass.getSimpleName());
    }
}
