package com.spike.iotest.class1;

import java.io.*;

/**
 * 复制多级文件夹
 * 需求：
 *      把“E:\\ITCAST" 复制到F盘目录下
 * 思路
 *      1、创建数据源File对象，路径是E:\\itcast
 *      2、创建目的地File对象，路径是F:\\
 *      3、写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
 *      4、判断数据源File是否是目录
 *          是：
 *              A: 在目的地下创建和数据源File名称一样的目录
 *              B：获取数据源File下所有的文件或者目录的File数组
 *              C：遍历该File数组，得到每一个File对象
 *              D：把该File作为数据源File对象，递归调用复制文件夹的方法
 *          不是：说明是文件，直接复制，用字节流
 */
public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException{
        // 创建数据源File对象
        File fileInput = new File("F:\\Workspace\\aaaa");
        // 创建目的地File对象
        File fileOutput = new File("F:\\Workspace\\bbbb");

        double startTime = System.currentTimeMillis();

        // 写方法实现文件夹的复制，参数为数据源和目的地File对象
        copyFolder(fileInput, fileOutput);

        double endTime = System.currentTimeMillis();

        System.out.println("共用时间：" + (endTime - startTime) + "毫秒");


    }

    // 复制文件夹
    private static void copyFolder(File fileInput, File fileOutput) throws IOException{
        // 判断数据源是否是目录
        if (fileInput.isDirectory()) {
            // 在目的地下创建一个同名的目录
            String fileInputName = fileInput.getName();
            File newFolder = new File(fileOutput, fileInputName);
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }

            // 获取数据源File下的所有文件或者目录的File数组
            File[] fileArray = fileInput.listFiles();

            // 遍历该File数组，得到每一个File对象
            for (File file: fileArray) {
                // 把该File作为数据源File对象，递归调用复制文件夹的方法
                copyFolder(file, newFolder);
            }

        } else {
            // 说明是文件，直接复制，用字节流
            File newFile = new File(fileOutput, fileInput.getName());
            copyFile(fileInput, newFile);
        }
    }

    // 字节缓冲流复制文件
    private static void copyFile(File fileInput, File fileOutput) throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileInput));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileOutput));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();

    }
}
