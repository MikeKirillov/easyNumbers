package JavaCore.Module16;

import static java.lang.invoke.MethodHandles.loop;

public class SOExample {
    public static void main(String[] args) {// example how to get java.lang.StackOverflowError
        // рекурсивный вызов глубиной в
        // 50 тысяч фреймов
        loop(50_000);
        System.out.println("Success!");
    }

    public static void loop(int repeats) {
        if (repeats > 0) {
            loop(repeats - 1);
        }
    }
}
