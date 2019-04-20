package com.gupaoedu.dengxinlei.pattern.singleton;

/**
 * 注册式单例-枚举式
 */
public enum RegisterEnumSingleton {
    instance;
    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static RegisterEnumSingleton getInstance() {
        return instance;
    }
}
