package com.gupaoedu.dengxinlei.pattern.prototype.simple;

/**
 * 简单原型工厂
 */
public class SimplePrototypeFactory {

    public static Prototype startClone(Prototype prototype) {
        return prototype.clone();
    }
}
