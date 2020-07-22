package com.spike;

import java.io.File;
import java.util.TreeSet;

public class test {

    public static void main(String[] args) {
        File file = new File("./src/com/spike");

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        TreeSet<Student> ok = new TreeSet<Student>();
    }
}
