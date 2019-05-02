package com.gupaoedu.dengxinlei.pattern.proxy.jdkdynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Teacher implements InvocationHandler {
    private Student target;
    public Object getInstance(Student target) {
        this.target = target;
        Class clazz = this.target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void after() {
        System.out.println("老师发现学生作业的错误，开始指点学生改作业");
    }

    private void before() {
        System.out.println("老师准备检查学生作业");
    }
}
