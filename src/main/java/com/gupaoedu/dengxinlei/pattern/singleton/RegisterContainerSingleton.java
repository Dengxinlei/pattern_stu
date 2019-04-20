package com.gupaoedu.dengxinlei.pattern.singleton;

import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例-容器式 适用于 管理多个单实例对象场景 Spring中使用这类
 */
public class RegisterContainerSingleton {
    private RegisterContainerSingleton() {}
    private static final Map<String, Object> container = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className) {
        synchronized (container) {
            if(!container.containsKey(className)) {
                try {
                    container.put(className, Class.forName(className).newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            return container.get(className);
        }
    }


}
