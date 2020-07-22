package com.spike.wrappertest;

public class NumberTest {
    public static void main(String[] args) {
        // 向上转型为Number:
        Number num = new Integer(999);
        // 获取byte, int, long, float, double:
        byte b = num.byteValue();
        int n = num.intValue();
        long ln = num.longValue();
        float f = num.floatValue();
        double d = num.doubleValue();
        System.out.println("b:" + b + " n:" + n + " ln:" + ln + " f:" + f + " d:" + d);
    }
}

