package com.gupaoedu.dengxinlei.pattern.singleton;

/**
 * 传统懒汉式
 * 优点: 当需要使用到该实例时才创建对应对象
 * 缺点: 存在线程安全问题，当有多个线程获取实例时可能会多次创建对象出现对象的覆盖，制造一个单例的假象。
 *
 *     解决获取实例时线程安全问题的办法：
 *     1.getInstance() 方法上添加Synchronized同步锁
 *       但是有一个明显缺点就是会牺牲部分性能，甚至可能锁住整个累，其他线程直接无法进入这个方法,详见getInstanceV2()
 *
 *     2.基于1这种方式的一个升级方案——双重锁校验 可以提升一些性能,详见getInstanceV3()
 *
 *
 *
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton() {
        if(lazySingleton != null) {
            // 防止暴力反射方式创建实例
            throw new RuntimeException("不能创建实例对象");
        }
    }

    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


    public static synchronized  LazySingleton getInstanceV2() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static LazySingleton getInstanceV3() {
        if(lazySingleton == null) {
            // 如果单单是这样的一个同步代码块，那么每个线程来了都需要获取对象锁，性能仍然有影响 所以在代码块上层再进行一次判断
            synchronized (LazySingleton.class) {
                if(lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
