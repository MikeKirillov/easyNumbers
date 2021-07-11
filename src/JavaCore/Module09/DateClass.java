package JavaCore.Module09;

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("current date and time is: " + date);// return current date and time
        System.out.println("current date and time in ling value: " + date.getTime());// return current date and time in long value

        date.setTime(111111123L);
        System.out.println("new date and time: " + date);// set date and time and return it

        Date date1 = new Date(11111111111L);
        System.out.println("return value of date1: " + date1);// return: Sat May 09 17:25:11 MSK 1970

        long time = System.currentTimeMillis();
        System.out.println("current system time in long value is: " + time);// return current system time in long variable

        System.out.println(date.after(date1));// return true or false if 1st is bigger than 2nd
        System.out.println(date.before(date1));// return true or false if 1st is smaller than 2nd
        System.out.println(date.compareTo(date1));// return:
        // -1 if 1st is smaller,
        // 0 if equals,
        // 1 if 1st is bigger
    }
}
