package com.gupaoedu.dengxinlei.pattern.factory.abstractfactory;


public abstract class CarFactory {
    // 小轿车
    public abstract ISedanCar createISedanCar();
    // 跑车
    public abstract ISportCar createISportCar();
}
