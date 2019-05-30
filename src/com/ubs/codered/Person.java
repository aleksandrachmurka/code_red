package com.ubs.codered;

import java.util.Calendar;

public class Person {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age= a;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int growOld(int years) {
        return age += years;
    }

    public int getBirthYear() {
        return Calendar.getInstance().get(Calendar.YEAR) - age;
    }

}
