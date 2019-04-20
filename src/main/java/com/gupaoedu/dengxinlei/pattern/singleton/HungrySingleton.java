package com.gupaoedu.dengxinlei.pattern.singleton;

/**
 * 饿汉式
 * 缺点: 如果一直未被使用，那会造成空间的浪费。
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();
    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }

}
