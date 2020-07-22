package com.spike;


import java.time.DayOfWeek;
import java.time.LocalDate;

public class CanlendarTest {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);   // 本月开始的第一天
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();     // 1=monday, ..., 7=sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");

//        System.out.printf("%3d", date.getDayOfMonth());

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
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
