package com.spike.lala;

import java.util.Objects;
import static java.lang.System.*;

public class Test {

    public static void main(String[] args) {
        Person p = new Student();
        p.run();
        p.test();
    }
}

abstract class Person {
    public abstract void run();

    public void test() {
        out.println("this is a test");
    }
}

class Student extends Person {

    @Override
    public void run() {
        System.out.println("Student run");
    }

}


interface hello {
    void fun();
    void say();
}

interface saygood extends hello {
    void nb();
}

class CQ implements saygood {

    @Override
    public void fun() {

    }

    @Override
    public void say() {

    }

    @Override
    public void nb() {

    }
}