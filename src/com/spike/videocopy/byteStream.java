package com.spike;

import java.io.FileInputStream;
import java.io.IOException;

public class byteStream {

    static String filePath = "/Users/kevinz/workspace/java/VideoCopy/src/com/spike/ok.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);

        int len;
        while ((len = fis.read()) != -1) {
            System.out.println((char) len);
        }

        fis.close();
    }
}
