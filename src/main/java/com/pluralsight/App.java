package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter euro = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter iso8601 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter weekDay = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");
        DateTimeFormatter weekDayTime = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm").withZone(ZoneId.of("GMT"));

        System.out.println(now.format(euro));
        System.out.println(now.format(iso8601));
        System.out.println(now.format(weekDay));
        System.out.println(now.format(weekDayTime));


    }
}
