package com.gupaoedu.dengxinlei.pattern.factory.abstractfactory;

/**
 * 抽象工厂主要作用于比较复杂的具有产品族和产品等级这一情形
 */
public abstract class CarFactory {
    // 小轿车
    public abstract ISedanCar createISedanCar();
    // 跑车
    public abstract ISportCar createISportCar();
}
