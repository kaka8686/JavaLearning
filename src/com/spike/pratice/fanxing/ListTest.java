package com.spike.fanxing;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        // 编译器警告:
        List<Number> list = new ArrayList<>();
        list.add(new Integer(123));
        list.add(new Double(11.34));

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
