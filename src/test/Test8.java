package test;

import java.time.*;

public class Test8 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println(today.plusYears(1).getDayOfWeek());

        LocalTime teaTime = LocalTime.of(17, 30);
        System.out.println(teaTime);

        Duration timeGap = Duration.between(LocalTime.now(), LocalTime.of(23, 0));
        System.out.println(timeGap);

        System.out.println(timeGap.toHours());
        System.out.println(timeGap.toMinutes());
        System.out.println(timeGap.toMinutesPart());


        LocalDateTime tomorrowTea = LocalDateTime.of(today.plusDays(1), teaTime);
        System.out.println(tomorrowTea);

        ZoneId katmandu = ZoneId.of("Asia/Katmandu");
        System.out.println(katmandu);

        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime londonTime = ZonedDateTime.of(tomorrowTea, london);
        System.out.println(londonTime);

        System.out.println(londonTime.getOffset());




    }

}
