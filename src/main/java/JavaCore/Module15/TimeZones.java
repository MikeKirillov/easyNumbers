package JavaCore.Module15;

import java.time.*;

public class TimeZones {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        System.out.println(ZonedDateTime.of(LocalDate.of(2013,1,1), LocalTime.of(4,12,12), ZoneId.of("US/Eastern")));

        StringBuilder string = new StringBuilder();// just for StringBuilder reminding
        System.out.println(string.append(ZonedDateTime.now()).append(" is a current time zone"));

        System.out.println(ZoneId.getAvailableZoneIds());// if u wanna know all time zones


        // task 15.1.1
        ZonedDateTime zdt = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Europe/Moscow"));
        System.out.println(zdt);
        System.out.println(zdt.plusYears(14));// zdt + 14
        System.out.println(zdt.minusYears(14));// zdt - 14
        System.out.println(zdt.withYear(1994));// zdt overwrite its year to 1994

        LocalTime time = LocalTime.of(16,30);
        System.out.println(time);

//        time.withHour(14).plusMinutes(15);
        time = time.withHour(14).withMinute(45);
        System.out.println(time);

        LocalTime newTime = time.withHour(14).withMinute(45);
        System.out.println(newTime);
    }
}
