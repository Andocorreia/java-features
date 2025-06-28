package br.com.releases.java8;

// Explicação
// A Date and Time API do Java foi completamente reformulada na versão Java 8,
// com a introdução do pacote java.time. Essa nova API foi inspirada na
// biblioteca Joda-Time e resolve várias limitações da antiga API
// (java.util.Date, Calendar, etc.).

// Vantagens da nova API
// Imutabilidade: todas as classes são imutáveis e thread-safe.
// Clareza: nomes de métodos e classes mais intuitivos.
// Precisão: melhor suporte a fusos horários e cálculos de tempo.
// Integração com Streams: fácil de usar com a API de Streams.

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeApi {

    public Periodo localDateTime () {

        Periodo periodo = new Periodo();

        periodo.setDate(LocalDate.now());
        System.out.println("the current date is " + periodo.getDate());

        periodo.setTime(LocalTime.now());
        System.out.println("the current time is " + periodo.getTime());

        periodo.setDateTime(LocalDateTime.now());
        System.out.println("current date and time : " + periodo.getDateTime());

        DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatedDateTime = periodo.getDateTime().format(format);
        System.out.println("in formatted dd-MM-yyyy HH:mm:ss: " + formatedDateTime);

        Month month = periodo.getDateTime().getMonth();
        int day = periodo.getDateTime().getDayOfMonth();
        int seconds = periodo.getDateTime().getSecond();
        System.out.println("Month : "+month+" day : " + day+" seconds : "+seconds);

        LocalDate date2 = LocalDate.of(1950,1,26);
        System.out.println("the republic day :"+date2);

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

        periodo.setZoneDateTime(ZonedDateTime.now());
        System.out.println("the current zone is " + periodo.getZoneDateTime().getZone());

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
