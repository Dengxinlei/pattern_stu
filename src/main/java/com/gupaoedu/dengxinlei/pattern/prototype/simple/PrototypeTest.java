package com.gupaoedu.dengxinlei.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) {
        Person p = new Person("张三三", 18, 1);
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("唱歌");
        hobbies.add("跳舞");
        p.setHobbies(hobbies);
        Person copy = (Person)SimplePrototypeFactory.startClone(p);
        System.out.println(p);
        System.out.println(copy);
        p.setName("李四");
        p.getHobbies().add("绘画");
        System.out.println(p);
        System.out.println(copy);
        System.out.println(p.getHobbies() == copy.getHobbies());
    }
}
