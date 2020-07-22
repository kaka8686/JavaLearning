package com.spike.iotest;

import java.io.File;
import java.io.IOException;

public class getfile {
    public static void main(String[] args) throws IOException {
//        File f = new File("./../readme.txt");

        File f = new File("../readme.txt");
        System.out.println(f.getPath());
        System.out.println(f.getCanonicalPath());
//        System.out.println(f.getAbsolutePath());


//        System.out.println(f.isDirectory());
//        System.out.println(f.isFile());
//        System.out.println(f.canRead());

    }
}
