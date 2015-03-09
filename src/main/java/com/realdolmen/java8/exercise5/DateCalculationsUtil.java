package com.realdolmen.java8.exercise5;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Created by KDAAU95 on 6/03/2015.
 */
public class DateCalculationsUtil {

    public static Duration calculateDaysOnEarthSince(Instant instant) {
        Instant now = Instant.now();
        if(instant.isAfter(now)) {
            throw new IllegalArgumentException("You cannot be a time traveller from the future");
        }
        return Duration.between(instant, Instant.now());
    }

    public static long calculateSpeechMartinLutherKing(ChronoUnit chronoUnit) {
        LocalDate speech = LocalDate.of(1963, Month.AUGUST, 28);
        return chronoUnit.between(speech, LocalDate.now());
    }

    public static LocalTime calculateDateTimeAbroad(LocalTime localTime, ZoneId localZoneId, ZoneId abroadZoneId) {
        ZonedDateTime localZonedDateTime = ZonedDateTime.of(LocalDateTime.of(LocalDate.now(), localTime), localZoneId);
        return localZonedDateTime.withZoneSameInstant(abroadZoneId).toLocalTime();
    }
}
