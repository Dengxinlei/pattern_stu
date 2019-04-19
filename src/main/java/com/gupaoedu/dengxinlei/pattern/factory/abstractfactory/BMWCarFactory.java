package com.gupaoedu.dengxinlei.pattern.factory.abstractfactory;

public class BMWCarFactory extends CarFactory {
    public ISedanCar createISedanCar() {
        return new BMWSedanCar();
    }

    public ISportCar createISportCar() {
        return new BMWSportCar();
    }
}
