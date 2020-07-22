package com.spike.wrappertest;

public class wrapperTest {

//    public static void main(String[] args) {
////        int i = 100;
////        // 通过new操作符创建Integer实例(不推荐使用,会有编译警告):
////        Integer n1 = new Integer(i);
////        // 通过静态方法valueOf(int)创建Integer实例:
////        Integer n2 = Integer.valueOf(i);
////        // 通过静态方法valueOf(String)创建Integer实例:
////        Integer n3 = Integer.valueOf("100");
////        System.out.println(n3.intValue());
//    }


    public static void main(String[] args) {
        Integer x = 127;
        Integer y = 127;
        Integer m = 99999;
        Integer n = 99999;
        System.out.println("x == y: " + (x == y)); // true
        System.out.println("m == n: " + (m == n)); // false
        System.out.println("x.equals(y): " + x.equals(y)); // true
        System.out.println("m.equals(n): " + m.equals(n)); // true
    }
}


