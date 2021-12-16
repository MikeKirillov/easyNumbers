package JavaCore.Module25;

public class StackTracing {
    public static void main(String[] args) {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
/*
         25.2.1. print current stack trace
*/
//        for (StackTraceElement element : stack) {
//            System.out.println(element);
//        }

/*
         25.2.2. always print stack trace
*/
        int x = 25, y = 0, z;
//        try {
//            z = x / y;
//        } catch (Exception e) {
////            e.printStackTrace();
//            for (StackTraceElement element : stack) {
//                System.out.println(element);
//            }
//        }

/*
         25.2.3. check if getStackTrace() returns non-empty collection
*/
        try {
            z = x / y;
        } catch (Exception e) {
            if (checkEmptyStackTrace(stack)) {
                for (StackTraceElement element : stack) {
                    System.out.println(element);
                }
            }
        }
    }

    public static boolean checkEmptyStackTrace(StackTraceElement[] stack) {
        return stack != null; // returns true if not null
    }
}
