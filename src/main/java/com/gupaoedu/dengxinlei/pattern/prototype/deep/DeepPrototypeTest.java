package com.gupaoedu.dengxinlei.pattern.prototype.deep;

import com.sun.tools.javac.main.JavaCompiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeepPrototypeTest {
    public static void main(String[] args) throws Exception{
//        Children children = new Children();
//        children.setAge(19);
//        children.setName("王麻子");
//        children.setGendar(0);
//        List<String> hobbies = new ArrayList<String>();
//        hobbies.add("嫦娥");
//        hobbies.add("跳舞");
//        children.setHobbies(hobbies);
//        Children copy = (Children)children.clone();
//
//        System.out.println(children);
//        System.out.println(copy);
//        System.out.println(children.getHobbies() == copy.getHobbies());
        System.out.println(DeepPrototypeTest.class.getResource("").getPath());
        System.out.println(DeepPrototypeTest.class.getClassLoader().getResource("").getPath());

    }
}
