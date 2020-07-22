package com.spike.enums;

import java.util.Scanner;

public class EnumTest {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
//        String input = in.next().toUpperCase();
//        Size size = Enum.valueOf(Size.class, input);
//    }
//
//    enum Size{
//        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
//
//        private Size(String abbreviation) {
//            this.abbreviation = abbreviation;
//        }
//        public String getAbbreviation() {
//            return abbreviation;
//        }
//
//        private String abbreviation;
//    }

//    public static void main(String[] args) {
//
//        Weekday day = Weekday.SUN;
//        if (day == Weekday.SAT || day == Weekday.SUN) {
//            System.out.println("Work at home!");
//        } else {
//            System.out.println("Work at office!");
//        }
//    }
//
//
//    enum Weekday {
//        SUN, MON, TUE, WED, THU, FRI, SAT;
//    }


//    public static void main(String[] args) {
//        Weekday day = Weekday.SUN;
//        if (day.dayValue == 6 || day.dayValue == 0) {
//            System.out.println("Work at home!");
//        } else {
//            System.out.println("Work at office!");
//        }
//
//        System.out.println(day.dayValue);
//    }
//
//
//    enum Weekday {
//        MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);
//
//        public final int dayValue;
//
//        private Weekday(int dayValue) {
//            this.dayValue = dayValue;
//        }
//    }


    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if (day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("Today is " + day.name() + ". Work at home!");
        } else {
            System.out.println("Today is " + day+ ". Work at office!");
        }
    }
}

enum Weekday {
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");

    public final int dayValue;
    private final String chinese;

    private Weekday(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

//    @Override
//    public String toString() {
//        return this.chinese;
//    }


}
