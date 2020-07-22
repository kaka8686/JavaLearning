package com.spike.StringTest;

public class StringBuilderTest {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder(1024);
            sb.append("Mr ")
                    .append("Bob")
                    .append("!")
                    .insert(0, "Hello, ");
            System.out.println(sb.toString());
        }

}
