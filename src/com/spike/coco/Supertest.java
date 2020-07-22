package com.spike.coco;

class Person {
    protected String name;
    static int ss;
    static double sa;


    public Person(String name) {
        this.name = name;
//        System.out.println("1");
//        System.out.println(name);
    }
}

class Student extends Person {

    public Student(String name, String name1) {
        super(name);
//        System.out.println("2");
        this.name = name1;
    }

    public void getInfo(){
        System.out.println(this.name);
        System.out.println(super.name);
    }

}

public class Supertest {
    public static void main(String[] args) {
        Student s1 = new Student("Father","Child");
        s1.getInfo();
    }
}
