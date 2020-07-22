package com.spike.iotest;

import java.io.FileInputStream;
import java.io.IOException;

public class streamtest {

    public static void main(String[] args) throws IOException {
        streamtest ss = new streamtest();
        ss.readFile();
    }

    public void readFile() throws IOException {
        // 创建一个FileInputStream 对象
//        FileInputStream fileInput = null;
//        try {
//            new FileInputStream("src/readme.txt");
//
////            for (; ; ) {
////                int n = fileInput.read();       // 反复调用read方法，直到返回-1为止
////                if (n == -1) {
////                    break;
////                }
////                System.out.println(n);
////            }
//
//
//            int n;
//            while ((n = fileInput.read()) != -1) { // 利用while同时读取并判断
//                System.out.println(n);
//            }
//        }
//        finally {
//            if (fileInput != null)
//                fileInput.close();
//        }

        // Java 7 后引入了新特性try(resource)，编译器会自动关闭文件流
        try(FileInputStream input = new FileInputStream("src/readme.txt")) {
            int n;
            while ((n = input.read()) != -1) {
                System.out.println(n);
            }
        }



    }
}
