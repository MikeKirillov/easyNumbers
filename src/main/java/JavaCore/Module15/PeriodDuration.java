package JavaCore.Module15;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodDuration {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Period period = Period.ofYears(10);

        LocalTime time = LocalTime.now();
        Duration duration = Duration.ofHours(13);

        System.out.println(date + " " + time);
//        System.out.println(date.plus(period) + " " + time.minus(duration));

        // changing date and time to new value by period and duration
        LocalDate newDate = date.plus(period);
        LocalTime newTime = time.minus(duration);

        System.out.println(newDate + " " + newTime);

    }

    public boolean isGreaterTime(LocalTime time, Duration duration) {
        return time.plus(duration).isAfter(LocalTime.now());
        // returns true if current time + duration is greater than current time
    }
}
