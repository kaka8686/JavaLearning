package com.spike.arrayList;

public class Person implements Comparable<Person>{
    private String name;
    private int score;

    public Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(String.valueOf(other.score));
    }

    public String toString() {
        return this.name + "'s " + this.score;
    }
}
