package com.spike.lala;

import java.util.Random;

public class MathTest {

    public static void main(String[] args) {

//        double min = 10;
//        double max = 50;
//        for (int i = 0; i < 100; i++) {
//            double x = Math.random(); // x的范围是[0,1)
//            double y = x * (max - min) + min; // y的范围是[10,50)
//            System.out.println(y);
//        }
////        long n = (long) y; // n的范围是[10,50)的整数
//
////        System.out.println(n);

        Random r = new Random(12345);
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(100));
        }
    }
}
