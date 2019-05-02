package com.gupaoedu.dengxinlei.pattern.proxy.staticproxy;

/**
 * 静态代理类-对儿子对象的一个代理，控制对儿子对象的访问，作用于保护儿子对象及对其功能和职责进行了增强
 * 属于一种结构型设计模式
 */
public class Father {
    private Son son;
    public Father(Son son) {
        this.son = son;
    }

    public void checkHomeword() {
        before();
        son.checkHomeword();
        after();
    }

    private void after() {
        System.out.println("父亲发现儿子作业错误的地方，开始指点儿子改作业");
    }

    private void before() {
        System.out.println("父亲准备检查儿子作业");
    }


}
