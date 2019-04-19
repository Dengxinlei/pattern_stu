package com.gupaoedu.dengxinlei.pattern.factory.simplefactory;

import com.gupaoedu.dengxinlei.pattern.factory.ICar;

public class SimpleFactory {
    public ICar create(Class clazz) {
        if(clazz != null) {
            try {
                return (ICar)clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
