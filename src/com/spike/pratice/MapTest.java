//package com.spike.pratice;
//
//
//import com.sun.tools.javac.util.List;
//
//import java.util.*;
//
///*
// *  请编写一个根据name查找score的程序，并利用Map充当缓存，以提高查找效率：
// */
//
//public class MapTest {
//
//    public static void main(String[] args) {
//        List<Student> list = List.of(
//                new Student("Bob", 78),
//                new Student("Alice", 85),
//                new Student("Brush", 66),
//                new Student("Newton", 99));
//        Students holder = new Students(list);
//        System.out.println(holder.getScore("Bob") == 78 ? "测试成功!" : "测试失败!");
//        System.out.println(holder.getScore("Alice") == 85 ? "测试成功!" : "测试失败!");
//        System.out.println(holder.getScore("Tom") == -1 ? "测试成功!" : "测试失败!");
//    }
//}
//
//class Students {
//    List<Student> list;
//    Map<String, Integer> cache;
//
//    Students(List<Student> list) {
//        this.list = list;
//        cache = new HashMap<>();
//        setCache();
//    }
//
//    /**
//     * 根据name查找score，找到返回score，未找到返回-1
//     */
//    int getScore(String name) {
//        // 先在Map中查找:
//        Integer score = this.cache.get(name);
//        if (score == null) {
//            // TODO:
////            return -1;
//        }
//        return score == null ? -1 : score.intValue();
//    }
//
//    Integer findInList(String name) {
//        for (Student ss : this.list) {
//            if (ss.name.equals(name)) {
//                return ss.score;
//            }
//        }
//        return null;
//    }
//
//    public void setCache() {
//        for (int i = 0; i < list.size(); i++) {
//            cache.put(list.get(i).name, list.get(i).score);
//        }
//    }
//}
//
//class Student {
//    String name;
//    int score;
//
//    Student(String name, int score) {
//        this.name = name;
//        this.score = score;
//    }
//
//
//}
