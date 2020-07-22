package com.spike;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDate;

public class datetest {
    public static void main(String[] args) {
//        System.out.println(new Date());
//        Date birthday = new Date();
//        birthday = null;
//        String s = birthday.toString();

        // LocalDate
//        LocalDate newYEve = LocalDate.now();
//        LocalDate aThousandDaysLater = newYEve.plusDays(1000);
//
//        System.out.println(aThousandDaysLater.getYear());

        // LocalDate 日历
        LocalDate date = LocalDate.now();

        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
//        System.out.println("month: " + month + " today: " + today);
        date = date.minusDays(today - 1);   // set to start of month
//        System.out.println(date);
        DayOfWeek weekday = date.getDayOfWeek();
//        System.out.println(weekday);
        int value = weekday.getValue();     // 1 = Monday, ... 7 = Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }

        while (date.getMonthValue() == month) {

            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
    }
}
