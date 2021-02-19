package CommonToolsLearn;

import java.time.*;
import java.util.Set;

public class NewDateLearn {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for(String s:availableZoneIds){
            System.out.println(s);
        }
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(localDateTime);

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(zonedDateTime1);

        LocalTime now1 = LocalTime.now();
        LocalTime now2 = LocalTime.of(15, 23, 32);
        Duration duration = Duration.between(now1, now2);
        System.out.println(duration);
        System.out.println(duration.getSeconds());
        System.out.println(duration.getNano());
        LocalDateTime localDateTime2 = LocalDateTime.of(2016, 6, 12, 15, 23, 32);
        LocalDateTime localDateTime3 = LocalDateTime.of(2017, 6, 12, 15, 23, 32);
        Duration duration1 = Duration.between(localDateTime2, localDateTime3);
        System.out.println(duration1.toDays());


    }
}
