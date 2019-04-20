package com.gupaoedu.dengxinlei.pattern.singleton;

/**
 * 懒汉式最优的一种写法，采用静态内部类的方式，基于jvm对静态内部类的加载和初始化机制形成天然懒加载模式
 *
 */
public class InnerCLassLazySingleton {
    private InnerCLassLazySingleton() {
    }
    public static InnerCLassLazySingleton getInstance() {
        return Inner.innerCLassLazySingleton;
    }

    // jvm中 加载静态内部类机制是当第一调用该静态内部类中的方法或静态变量时 执行加载和初始化操作
    private static class Inner {
        static InnerCLassLazySingleton innerCLassLazySingleton = new InnerCLassLazySingleton();
    }

    // 覆盖反序列化创建的实例对象
    private Object readResolve() {
        return Inner.innerCLassLazySingleton;
    }
}
