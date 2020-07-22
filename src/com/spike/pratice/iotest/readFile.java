package com.spike.iotest;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class readFile {
//    public static void main(String[] args) throws IOException {
//
//        String s;
//        try (FileInputStream input = new FileInputStream("/Users/kevinz/workspace/java/Chapter1/src/com/spike/readme.txt")) {
//            int n;
//            StringBuilder sb = new StringBuilder();
//            while ((n = input.read()) != -1) {
//                sb.append((char) n);
//            }
//
//            s = sb.toString();
//        }
//        System.out.println(s);
//    }


    // 重构版
    // 这里使用InputStream 而不是 FileInputStream
    // 这就是面向抽象编程原则的应用：接受InputStream抽象类型，而不是具体的FileInputStream类型，从而使得代码可以处理InputStream的任意实现类。
    public static void main(String[] args) throws IOException{
//        String s;
//
//        try (InputStream input = new FileInputStream("/Users/kevinz/workspace/java/Chapter1/src/com/spike/readme.txt")) {
//            s = readAsString(input);
//        }
//        System.out.println(s);


        byte[] data = { 72, 101, 108, 108, 111, 33 };
        try (InputStream input = new ByteArrayInputStream(data)) {
            String s = readAsString(input);
            System.out.println(s);
        }
    }

    private static String readAsString(InputStream input) throws IOException {

        int n;
        StringBuilder sb = new StringBuilder();
        while ((n = input.read()) != -1) {
            sb.append((char) n);
        }

        return sb.toString();
    }
}


