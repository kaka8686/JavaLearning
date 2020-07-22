package com.spike;

import java.util.Random;

public class ConstructorTest {

    public static void main(String[] args) {
        Random random = new Random();
        int small = random.nextInt(10000);
        System.out.println(small);
    }
}
