//package com.spike.pratice.collectiontest;
//
//
//
////import java.util.List;
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
//
//import java.util.Objects;
//
//public class equalsTest {
//
//
//    public static void main(String[] args) {
//        java.util.List<Person> list = List.of(
//                new Person("Xiao", "Ming", 18),
//                new Person("Xiao", "Hong", 25),
//                new Person("Bob", "Smith", 20)
//        );
//
//
//        boolean exist = list.contains(new Person("Bob", "Smith", 20));
//        System.out.println(exist ? "测试成功!" : "测试失败!");
//    }
//}
//
//class Person {
//    String firstName;
//    String lastName;
//    int age;
//
//    public Person(String firstName, String lastName, int age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//    }
//
//
//    public boolean equals(Object o) {
//        if (o instanceof Person) {
//            Person p = (Person) o;
//            return Objects.equals(this.firstName, p.firstName) && Objects.equals(this.lastName, p.lastName) && this.age == p.age;
//        }
//        return false;
//    }
//
//}
