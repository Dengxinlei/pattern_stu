package com.gupaoedu.dengxinlei.pattern.prototype.simple;

import java.util.List;

public class Person implements Prototype {
    private String name;
    private int age;
    private int gendar;
    private List<String> hobbies;
    public Person(String name, int age, int gendar) {
        this.name = name;
        this.age = age;
        this.gendar = gendar;
    }
    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
    public List<String> getHobbies() {
        return this.hobbies;
    }

    public void setName(String name) {
        this.name = name;
    }
    // 简单原型模式 实现了浅克隆，所以当克隆的成员属性是一个引用类型的时候会存在问题，当这个引用类型变量所引用的对象发生改变时，会导致所有
    // 通过克隆生成的对象中对应的引用对象发生改变
    @Override
    public Prototype clone() {
        Person p = new Person(this.name, this.age, this.gendar);
        p.setHobbies(this.hobbies);
        return  p;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gendar=" + gendar +
                ", hobbies=" + hobbies +
                '}';
    }
}
