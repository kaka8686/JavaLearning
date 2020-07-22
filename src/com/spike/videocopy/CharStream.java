package com.spike;

import java.io.*;

public class CharStream {

    /**
     * InputStreamReader: 是从字节流到字符流的桥梁
     *     它读取字节，并使用指定的编码将其解码为字符
     *     它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
     *
     * OutputStreamWriter：是从字符流到字节流的桥梁
     * 	使用指定的编码将写入的字符编码为字节
     * 	它使用的字符集可以由名称指定，也可以被明确指定，或者接受平台的默认字符集
     * @param args
     */

    public static void main(String[] args) throws IOException {
        String filePath = "/Users/kevinz/workspace/java/VideoCopy/src/com/spike/ok.txt";

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath),"GBK");
        osw.write("张凯");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "GBK");

        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }

        isr.close();
    }
}
