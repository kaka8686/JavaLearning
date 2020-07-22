package com.spike.StringTest;


import java.util.StringJoiner;

public class StringJoinerTest {

    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};

//        // 以下是StringBuilder实现方式
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello ");
//        for (String name : names) {
//            sb.append(name).append(", ");
//        }
//        // 注意去掉最后的", ":
//        System.out.println(sb.length());
//        System.out.println(sb.toString());
//        System.out.println(sb.toString().charAt(23));
//        sb.delete(sb.length() - 2, sb.length());
//        System.out.println(sb.toString());
//        sb.append("!");
//        System.out.println(sb.toString());


        // 以下是通过StringJoiner实现方式
        StringJoiner sj = new StringJoiner(", ", "Hello ", "!");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());


    }

}
