package com.boomi.java8;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample1 {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println("Current Time="+time);

        LocalTime specificTime = LocalTime.of(12,20,25,40);
        System.out.println("Specific Time of Day="+specificTime);


        LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST="+timeKolkata);

        LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
        System.out.println("10000th second time= "+specificSecondTime);

    }

}