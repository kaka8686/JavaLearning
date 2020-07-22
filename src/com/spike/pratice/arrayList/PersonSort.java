package com.spike.arrayList;

import java.util.Arrays;

public class PersonSort {

    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("kevin", 81),
                new Person("tofu", 88),
                new Person("Bob", 90)
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
