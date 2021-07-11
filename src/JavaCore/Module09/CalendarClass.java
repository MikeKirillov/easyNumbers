package JavaCore.Module09;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);
        System.out.println(calendar.getTime());// return full current date and time

//        System.out.println(calendar.get(Calendar.YEAR));

        int era = calendar.get(Calendar.ERA);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);

        int hour = calendar.get(Calendar.HOUR);// per 12-hours
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);// per 24-hours
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int millisecond = calendar.get(Calendar.MILLISECOND);

//        int september = calendar.get(Calendar.SEPTEMBER);
//        int may = calendar.get(Calendar.MAY);

//        System.out.println(millisecond);// return current date or time
        System.out.println("Current date " + hourOfDay + ":" + minute + ":" +
                second + " | " + dayOfMonth + "." + (month + 1) + "." + year);// + 1 to month cuz it starts from 0 in Java

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(calendar.getTime()));// return current date and time in our pattern
        System.out.println(dateFormat1.format(calendar.getTime()));// напрямую обращаться к calendar нельзя,
        // т.к. можно форматироввать только объекты класса Date, но не Calendar

        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        calendar.add(Calendar.HOUR_OF_DAY, 4);// add value to date or time. Use "-" to subtract this value
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));

        // after(Object calendar) and before (Object calendar) are same as Date

        System.out.println(calendar.get(Calendar.HOUR));
        calendar.clear();// clears date or time value and returns 0
        System.out.println(calendar.get(Calendar.HOUR));

        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        calendar.set(Calendar.HOUR_OF_DAY, 11);// sets a new value to date or time value
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    }
}
