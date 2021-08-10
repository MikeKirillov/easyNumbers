package JavaCore.Module13.ConsoleClock;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConsoleClock extends Thread {
    @Override
    public void run() {
        while (!isInterrupted()) {
            DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            Calendar calendar = Calendar.getInstance();
            calendar.getTime();

            String time = timeFormat.format(calendar.getTimeInMillis());
            System.out.println(time);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("The clock was stopped");
    }
}
