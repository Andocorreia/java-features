package br.com.treinamentos.diversos.releases.java8;

//Explanation
// The DateTime API in Java 8 introduced a new date and time library
// that is more comprehensive and user-friendly compared to the
// previous `java.util.Date` and `java.util.Calendar` classes.
// It is part of the `java.time` package and provides a more
// intuitive way to handle dates, times, durations, and time zones.

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeApi {

    public Periodo localDateTime () {

        Periodo periodo = new Periodo();

        // the current date
        periodo.setDate(LocalDate.now());
        System.out.println("the current date is " + periodo.getDate());

        // the current time
        periodo.setTime(LocalTime.now());
        System.out.println("the current time is " + periodo.getTime());

        // will give us the current time and date
        periodo.setDateTime(LocalDateTime.now());
        System.out.println("current date and time : " + periodo.getDateTime());

        // to print in a particular format
        DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatedDateTime = periodo.getDateTime().format(format);
        System.out.println("in formatted dd-MM-yyyy HH:mm:ss: " + formatedDateTime);

        // printing months days and seconds
        Month month = periodo.getDateTime().getMonth();
        int day = periodo.getDateTime().getDayOfMonth();
        int seconds = periodo.getDateTime().getSecond();
        System.out.println("Month : "+month+" day : " + day+" seconds : "+seconds);

        // printing some specified date
        LocalDate date2 = LocalDate.of(1950,1,26);
        System.out.println("the republic day :"+date2);

        // printing date with current time.
        LocalDateTime specificDate = periodo.getDateTime().withDayOfMonth(24).withYear(2016);
        System.out.println("specific date with " + "current time : "+specificDate);

        return periodo;
    }

    public Periodo zoned() {
        Periodo periodo = new Periodo();

        periodo.setDateTime(LocalDateTime.now());
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedCurrentDate = periodo.getDateTime().format(format1);
        System.out.println("formatted current Date and" + " Time : "+formattedCurrentDate);

        // to get the current zone
        periodo.setZoneDateTime(ZonedDateTime.now());
        System.out.println("the current zone is " + periodo.getZoneDateTime().getZone());

        // getting time zone of specific place
        // we use withZoneSameInstant(): it is
        // used to return a copy of this date-time
        // with a different time-zone,
        // retaining the instant.
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");

        ZonedDateTime tokyoZone =  periodo.getZoneDateTime().withZoneSameInstant(tokyo);
        System.out.println("tokyo time zone is " + tokyoZone);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDateTime = tokyoZone.format(format);
        System.out.println("formatted tokyo time zone " +  formatedDateTime);

        return periodo;
    }

    public Long duration() {
        ZonedDateTime zoneNow = ZonedDateTime.now();

        ZoneId brazil = ZoneId.of("Brazil/East");
        ZonedDateTime date1 = zoneNow.withZoneSameInstant(brazil);

        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime date2 = zoneNow.withZoneSameInstant(tokyo);

        long hours = Math.abs(Duration.between(date1.toLocalDateTime(), date2.toLocalDateTime()).toHours());
        System.out.println("Difference in hours between Brazil/East and Asia/Tokyo: " + hours + " hours");

        return hours;
    }
}

@Getter
@Setter
@NoArgsConstructor
class Periodo {
    private LocalDate date;
    private LocalDateTime dateTime;
    private LocalTime time;
    private ZonedDateTime zoneDateTime;
}
