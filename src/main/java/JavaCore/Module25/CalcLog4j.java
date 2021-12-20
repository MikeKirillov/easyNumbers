package JavaCore.Module25;

import java.util.Scanner;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class CalcLog4j {
    private static final Logger log = LogManager.getLogger(CalcLog4j.class);
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y;
        String z;

        System.out.println("enter 1st number");
        x = scanner.nextInt();
        log.info("1st number is " + x);

        System.out.println("enter arithmetic sign");
        z = scanner.next();
        log.info("sign is " + z);

        System.out.println("enter 2nd number");
        y = scanner.nextInt();
        log.info("2nd number is " + y);

        int result = result(x, y, z);

        System.out.println("operation: " + x + " " + z + " " + y + " = " + result);
        log.info("operation: " + x + " " + z + " " + y + " = " + result);
    }

    private static int result(int x, int y, String sign) {
        int result = 0;
        switch (sign) {
            case "+":
//                result = x + y;
                result = getSum(x, y);
                break;
            case "-":
//                result = x - y;
                result = getSub(x, y);
                break;
            case "*":
//                result = x * y;
                result = getMult(x, y);
                break;
            case "/":
                if (y == 0) {
                    log.fatal("can't divide by zero");
                } else {
//                    result = x / y;
                    result = getDivide(x, y);
                }
                break;
        }
        return result;
    }

    public static int getSum(int x, int y) {
        return x + y;
    }

    public static int getSub(int x, int y) {
        return x - y;
    }

    public static int getMult(int x, int y) {
        return x * y;
    }

    public static int getDivide(int x, int y) {
        return x / y;
    }
}
