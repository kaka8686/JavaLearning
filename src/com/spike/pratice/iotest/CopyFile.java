package com.spike.iotest;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 *
 * @author liaoxuefeng
 */
public class CopyFile {

    public static void main(String[] args) throws IOException {
//        if (args.length != 2) {
//            System.err.println("Usage:\n  java CopyFile.java <source> <target>");
//            System.exit(1);
//        }

        String source = "/Users/kevinz/workspace/java/Chapter1/src/com/spike/iotest/input.txt";
        String target = "/Users/kevinz/workspace/java/Chapter1/src/com/spike/iotest/output.txt";
        copy(source, target );
    }


    private static void copy(String source, String target) {
        // 检查source是否存在
        Path sourcePath = Paths.get(source).normalize().toAbsolutePath();
        if (!sourcePath.toFile().isFile()) {
            throw new IllegalArgumentException(source);
        }
        // 检查target是否存在，不存在创建
        Path targetPath = Paths.get(target).normalize().toAbsolutePath();
        Path targetParentPath = targetPath.getParent();
        System.out.println(targetParentPath.toString());
        if (!targetParentPath.toFile().exists()) {
            targetParentPath.toFile().mkdirs();
        } // 复制
        try (InputStream input = new FileInputStream(sourcePath.toString());
             OutputStream output = new FileOutputStream(targetPath.toString());) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = input.read(buffer)) != -1) {
                output.write(buffer, 0, len);
            }
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
