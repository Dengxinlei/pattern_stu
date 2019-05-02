package com.gupaoedu.dengxinlei.pattern.proxy.cglibdynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Meipo implements MethodInterceptor {
    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before();
        Object returnObj = proxy.invokeSuper(obj, args);
        after();
        return null;
    }

    private void after() {
        System.out.println("合适的话开始办事");
    }

    private void before() {
        System.out.println("找寻符合条件的对象");
    }

}
