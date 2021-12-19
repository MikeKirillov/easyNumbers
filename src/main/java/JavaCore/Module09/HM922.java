package JavaCore.Module09;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HM922 {
    public static void main(String[] args) {
        Time time = new Time();
        time.getTime();
    }
}

class Time {
    String date = "";

    public void getTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        date = dateFormat.format(calendar.getTime());
        System.out.println(date);
    }
}