package com.pluralsight;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();

        DateTimeFormatter euro = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter iso8601 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter weekDay = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        DateTimeFormatter weekDayTime = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm").withZone(ZoneId.of("GMT"));
        System.out.println(now.format(euro));
        System.out.println(now.format(iso8601));
        System.out.println(now.format(weekDay));
        System.out.println(now.format(weekDayTime));

        System.out.println("\nCHALLENGE");
        DateTimeFormatter challenge1 = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter challenge2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        System.out.println(now.format(challenge1) + " on " + now.format(challenge2));
    }
}
