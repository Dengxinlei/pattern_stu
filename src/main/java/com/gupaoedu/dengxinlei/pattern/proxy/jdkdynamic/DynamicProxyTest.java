package com.gupaoedu.dengxinlei.pattern.proxy.jdkdynamic;

import sun.misc.ProxyGenerator;

import java.util.concurrent.ConcurrentHashMap;

public class DynamicProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new Teacher().getInstance(new Student());
        person.checkHomeword();
        byte[] b = ProxyGenerator.generateProxyClass("", new Class[]{});
    }
}
