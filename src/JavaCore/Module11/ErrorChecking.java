package JavaCore.Module11;

public class ErrorChecking {
    // 1st example of OK working
//    public static void main(String[] args) {
//        System.out.println("Метод main() успешно запущен");
//        method1();
//        System.out.println("Метод main() заканчивает свою работу");
//    }
//
//    static void method1() {
//        System.out.println("Первый метод передаёт привет!");
//        method2();
//    }
//
//    static void method2() {
//        System.out.println("Второй метод передаёт привет!");
//    }

    // 2nd example of inner exception working
    public static void main(String[] args) {
        System.out.println("Метод Main успешно запущен");
        method1();
        System.out.println("Метод Main заканчивает свою работу");
    }

    static void method1() {
        try {
            System.out.println("Первый метод передаёт привет!");
            method2();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    static void method2() {
        int x = 10;
        int y = 0;
        double z = x / y;
        System.out.println(z);
        System.out.println("Второй метод");
    }

}
