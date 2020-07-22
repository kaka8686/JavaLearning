package com.spike.iotest.class1;


import java.io.File;

/**
 * 用递归遍历目录
 *
 */

public class FileDemo2 {
    public static void main(String[] args) {

        File file = new File("/Users/kevinz/workspace/java/JavaLearning");

        readPath(file);

    }

    public static void readPath(File path) {
        File[] files = path.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    readPath(file);
                }
                else {
                    System.out.println(file);
                }
            }
        } else {
            System.out.println("没有文件！");
        }
    }
}
