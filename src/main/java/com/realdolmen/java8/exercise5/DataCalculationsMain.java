package com.realdolmen.java8.exercise5;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/**
 * Created by KDAAU95 on 6/03/2015.
 */
public class DataCalculationsMain {

    public static void main(String[] args) {
        calculateSecondsOnEarth();
        calculateMartinLutherKing();
        calculateMeetingTime();
    }

    private static void calculateSecondsOnEarth() {
        String bornDate = "1983-11-11T07:00:00Z";
        System.out.println("Seconds on earth: " + DateCalculationsUtil.calculateDaysOnEarthSince(Instant.parse(bornDate)).getSeconds());
    }

    private static void calculateMartinLutherKing() {
        System.out.println("Days ago that Martin Luther King held speech: " + DateCalculationsUtil.calculateSpeechMartinLutherKing(ChronoUnit.DAYS));
        System.out.println("Weeks ago that Martin Luther King held speech: " + DateCalculationsUtil.calculateSpeechMartinLutherKing(ChronoUnit.WEEKS));
    }

    private static void calculateMeetingTime() {
        System.out.println("Meeting must be scheduled at: " + DateCalculationsUtil.calculateDateTimeAbroad(LocalTime.of(15, 00), ZoneId.of("Europe/Paris"), ZoneId.of("America/Chicago")));
    }


}
