package com.date;

import java.time.Instant;
import java.time.ZoneId;

public class MainApp {

    public static void main(String[] args) {

        Instant now = Instant.now();
        now.atZone(ZoneId.of("Europe/Berlin"));

        System.out.println(now);


    }

}
