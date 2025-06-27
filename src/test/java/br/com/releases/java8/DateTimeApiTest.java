package br.com.releases.java8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DateTimeApiTest {

    @Test
    void currentDateTimeShouldReturnNonNullPeriodoWithCurrentDateTime() {
        DateTimeApi dateTimeApi = new DateTimeApi();
        Periodo periodo = dateTimeApi.localDateTime();

        assertNotNull(periodo);
        assertNotNull(periodo.getDate());
        assertNotNull(periodo.getTime());
        assertNotNull(periodo.getDateTime());
    }

    @Test
    void zonedShouldReturnNonNullPeriodoWithCurrentZoneDateTime() {
        DateTimeApi dateTimeApi = new DateTimeApi();
        Periodo periodo = dateTimeApi.zoned();

        assertNotNull(periodo);
        assertNotNull(periodo.getZoneDateTime());
    }

    @Test
    void durationShouldReturnCorrectGapBetweenTwoTimes() {
        DateTimeApi dateTimeApi = new DateTimeApi();
        Long duration = dateTimeApi.duration();

        assertNotNull(duration);
    }
}
