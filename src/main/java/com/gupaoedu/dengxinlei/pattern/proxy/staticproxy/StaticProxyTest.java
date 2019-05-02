package com.gupaoedu.dengxinlei.pattern.proxy.staticproxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        new Father(new Son()).checkHomeword();
    }
}
