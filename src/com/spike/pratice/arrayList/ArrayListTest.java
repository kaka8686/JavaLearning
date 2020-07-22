package com.spike.arrayList;


import com.spike.abstractClasses.Employee;

import java.util.ArrayList;
import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeMath.max;

/**
 * This Program demonstrates the ArrayList class.
 */

public class ArrayListTest {
//    public static void main(String[] args) {
//        // fill the staff array list with three Employee objects
////        ArrayList<Employee> staff = new ArrayList<>();
////
////        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
////        staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
////        staff.add(new Employee("Tony Tester", 4000, 1990,3,15));
////
////        // raise everyone's salary by 5%
////        for (Employee e: staff)
////            e.raiseSalary(5);
////
////        // print out information about all Employee objects
////        for (Employee e: staff) {
////            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
////        }
//
//
////        Integer n = 1;
////        Double x = 2.0;
////        System.out.println(true ? n : x);
//
////        String a = "3333";
////        int x = Integer.parseInt(a);
////        System.out.println(x);
////        System.out.println();
//
//
//
//
//    }


    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if (day == Weekday.SAT || day == Weekday.SUN) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
    }


    enum Weekday {
        SUN, MON, TUE, WED, THU, FRI, SAT;
    }


    
}
