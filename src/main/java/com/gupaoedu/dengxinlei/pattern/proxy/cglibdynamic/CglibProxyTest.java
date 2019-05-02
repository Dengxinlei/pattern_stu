package com.gupaoedu.dengxinlei.pattern.proxy.cglibdynamic;

public class CglibProxyTest {
    public static void main(String[] args) {
        Person person = (Person)new Meipo().getInstance(Person.class);
        person.findLove();
    }
}
