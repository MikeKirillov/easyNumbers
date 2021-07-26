package JavaCore.Module11;

public class MyZeroException extends ArithmeticException {
//    private int detail;

    public MyZeroException(String message/*, int detail*/) {
        super(message);
//        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException{" +
//                "detail=" + detail +
                "message=" + getMessage() +
                '}';
    }
}

class Bain {
    // 1st example
//    public static void main(String[] args) {
//        int i = 10;
//        int j = 0;
//
//        try {
//            if (j == 0) {
//                throw new MyZeroException("Warning!!! Division by zero!");
//            }
//            System.out.println(i / j);
//        } catch (MyZeroException e) {
//            System.out.println("You can divide by zero");
//        } finally {
//            System.out.println("Finally done");
//        }
//    }

    // 2nd example
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            if (j == 0) {
                throw new MyZeroException("Warning!!! Division by zero!");
            }
            System.out.println(i / j);
        } catch (MyZeroException e) {
            System.err.println("You can divide by zero");
        } finally {
            System.out.println("Finally done");
        }
    }
}
