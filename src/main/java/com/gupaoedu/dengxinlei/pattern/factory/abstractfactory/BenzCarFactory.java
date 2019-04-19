package com.gupaoedu.dengxinlei.pattern.factory.abstractfactory;

public class BenzCarFactory extends CarFactory {
    public ISedanCar createISedanCar() {
        return new BenzSedanCar();
    }

    public ISportCar createISportCar() {
        return new BenzSportCar();
    }
}
