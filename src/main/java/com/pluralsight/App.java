package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter euro = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter iso8601 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println(now.format(euro));
        System.out.println(now.format(iso8601));
    }
}
