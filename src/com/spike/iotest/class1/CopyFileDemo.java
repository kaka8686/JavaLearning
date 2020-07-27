package com.spike.iotest.class1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 复制文件加入异常处理
 */
public class CopyFileDemo {

    public static void main(String[] args) {

    }

    // jdk9开始带有的优化方法
//    public static void method4() throws IOException {
//        FileReader fr = new FileReader("fr.txt");
//             FileWriter fw = new FileWriter("fw.txt");
//        try (fr; fw) {
//
//            char[] chr = new char[1024];
//            int len;
//            while ((len = fr.read(chr)) != -1) {
//                fw.write(chr, 0, len);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

    // jdk7开始带有的优化方法
    public static void method3() {
        try (FileReader fr = new FileReader("fr.txt");
             FileWriter fw = new FileWriter("fw.txt");) {

            char[] chr = new char[1024];
            int len;
            while ((len = fr.read(chr)) != -1) {
                fw.write(chr, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // 一般处理方式
    public static void method2() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("fr.txt");
            fw = new FileWriter("fw.txt");

            char[] chr = new char[1024];
            int len;
            while ((len = fr.read(chr)) != -1) {
                fw.write(chr, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // 基本处理方式
    public static void method1() throws IOException {
        FileReader fr = new FileReader("fr.txt");
        FileWriter fw = new FileWriter("fw.txt");

        char[] chr = new char[1024];
        int len;
        while ((len = fr.read(chr)) != -1) {
            fw.write(chr, 0, len);
        }

        fw.close();
        fr.close();
    }
}
