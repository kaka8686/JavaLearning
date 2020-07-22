package com.spike.videocopy;

import java.io.*;

public class VideoCopy {

    static String inputFile = "/Users/kevinz/workspace/java/VideoCopy/src/com/spike/input/hello.mp4";
    static String outputFile = "/Users/kevinz/workspace/java/VideoCopy/src/com/spike/output/hello.mp4";

    public static void main(String[] args) throws IOException {
	// write your code here

        // 通过4种方式复制视频文件
        // 基本字节流一次读写一个字节
        // 基本字节流一次读写一个数组     357毫秒
        // 字节缓冲流一次读写一个字节     1286毫秒
        // 字节缓冲流一次读写一个数组     168毫秒

        long startTime = System.currentTimeMillis();

        // 拷贝方法实现
        videoCopy4();

        long endTime = System.currentTimeMillis();
        System.out.println("本次拷贝共计使用" + (endTime - startTime) + "毫秒！");
    }

    // 字节缓冲流一次读写一个数组
    private static void videoCopy4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys,0, len);
        }
        bos.close();
        bis.close();
    }

    // 字节缓冲流一次读写一个字节
    private static void videoCopy3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile));


        int len;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }

        bos.close();
        bis.close();
    }

    // 基本字节流一次读写一个数组
    private static void videoCopy2() throws IOException {
        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();
    }

    // 基本字节流一次读写一个字节
    private static void videoCopy1() throws IOException {
        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outputFile);

        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }

        fos.close();
        fis.close();
    }
}
