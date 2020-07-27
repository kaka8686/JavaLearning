package com.spike.myCollections.class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * 需求：
 *      通过程序实现斗地主过程中的洗牌，发牌和看牌，要求：对牌进行排序
 * 思路：
 *      1、创建HashMap，键是编号，值是牌
 *      2、创建ArrayList，存储编号
 *      3、创建花色数组，点数数组
 *      4、从0开始往HashMap里存编号，并存对应的牌，同时往ArrayList里存储编号
 *      5、洗牌（洗的是编号），用collections的shuffle()方法实现
 *      6、发牌（发的也是编号，为了保证编号是有序的，创建TreeSet集合接收
 *      7、定义看牌方法，（遍历TreeSet集合，获取编号，到HashMap集合找到对应的牌）
 *      8、调用看牌方法
 */

public class PokerDemo {
    public static void main(String[] args) {
        // 1、创建HashMap, 键是编号，值是牌
        HashMap<Integer, String> hm = new HashMap<>();

        // 2、创建ArrayList，存储编号
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 3、创建花色数组，点数数组
        String[] colors =  {"♦️", "♥️", "♠️", "♣️"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int index = 0;

        // 4、从0开始往HashMap里存编号，并存对应的牌，同时往ArrayList里存储编号
        for (String color : colors) {
            for (String number : numbers) {
                hm.put(index, color + number);
                arrayList.add(index);
                index++;
            }
        }

        hm.put(index, "小王");
        arrayList.add(index);
        index++;
        hm.put(index,"大王");
        arrayList.add(index);

        // 5、洗牌（洗的是编号），用collections的shuffle()方法实现
        Collections.shuffle(arrayList);

        // 6、发牌（发的也是编号，为了保证编号是有序的，创建TreeSet集合接收
        TreeSet<Integer> lqxSet = new TreeSet<>();     // 林青霞
        TreeSet<Integer> wzxSet = new TreeSet<>();     // 王祖贤
        TreeSet<Integer> qszSet = new TreeSet<>();     // 邱淑贞
        TreeSet<Integer> dpSet = new TreeSet<>();   // 底牌

        for (int i = 0; i < arrayList.size(); i++) {
            Integer x = arrayList.get(i);
            if (i >= arrayList.size()-3) {
                dpSet.add(x);
            } else if (i%3 == 0) {
                lqxSet.add(x);
            } else if(i%3 == 1) {
                wzxSet.add(x);
            } else if(i%3 == 2) {
                qszSet.add(x);
            }
        }

        PokerShow("林青霞", hm, lqxSet);
        PokerShow("王祖贤", hm, wzxSet);
        PokerShow("邱淑贞", hm, qszSet);
        PokerShow("底牌", hm, dpSet);

    }

    // 7、定义看牌方法，（遍历TreeSet集合，获取编号，到HashMap集合找到对应的牌）
    public static void PokerShow(String name, HashMap<Integer, String> hm, TreeSet<Integer> ts) {
        System.out.print(name + "的牌：");
        for (Integer key : ts){
            System.out.print(hm.get(key) + " ");
        }
        System.out.println();
    }
}
