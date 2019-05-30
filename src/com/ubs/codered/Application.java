package com.ubs.codered;

public class Application {

    public static void main(String[] args) {
        Person ola = new Person("ola", 30);

        System.out.println(ola.getName());
        System.out.println(ola.getAge());
        System.out.println(ola.growOld(2));
        System.out.println(ola.getBirthYear());

    }
}
