package com.spike.collectiontest;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {

        final int start = 10;
        final int end = 20;

        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }

        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        System.out.println(removed);
        System.out.println(list.toString());

        int found = foundMissingNumber(start, end, list);

//        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");


    }

    private static int foundMissingNumber(int start, int end, List<Integer> list) {
        int missingNumber = 0;
        int log = 0;


        for (int i = start; i <= end; i++) {

            if (list.contains(i))
                continue;
            else
                missingNumber = i;


        }
        return missingNumber;
    }
}
