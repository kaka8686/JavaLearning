package com.spike.pratice.rejecter;

public class PeopleTest {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("");
        ming.setAge(27);
        System.out.println(ming.getName() + "的年龄是" + ming.getAge());
    }
}


class People {
    private String[] names;

    public void setName(String... names){
        this.names = names;
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("invalid name");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}
