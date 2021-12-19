package JavaCore.Module15;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class InstantConvertation {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        ZonedDateTime zdt1 = Instant.now().atZone(ZoneId.of("Europe/Moscow"));
        ZonedDateTime zdt2 = now.atZone(ZoneId.of("Europe/Moscow"));
        System.out.println(zdt1);
        System.out.println(zdt2);

        Instant inst = ZonedDateTime.now().toInstant();
        System.out.println(inst);

        Date date = new Date();
        Instant instant = date.toInstant();
        ZonedDateTime zdt3 = instant.atZone(ZoneId.of("Europe/Moscow"));
        System.out.println(instant);
        System.out.println(zdt3);
    }

    public LocalTime convertDateTime(Date date) {
        Instant instant = date.toInstant();
        ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
        return zdt.toLocalTime();
        // return converted date to date + zonedId + LocalTime
    }
}