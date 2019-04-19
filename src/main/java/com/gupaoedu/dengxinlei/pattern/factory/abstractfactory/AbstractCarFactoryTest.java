package com.gupaoedu.dengxinlei.pattern.factory.abstractfactory;

public class AbstractCarFactoryTest {
    public static void main(String[] args) {
        CarFactory bmwCarFactory = new BMWCarFactory();
        bmwCarFactory.createISedanCar().run();
        bmwCarFactory.createISportCar().run();

        CarFactory benzCarFactory = new BenzCarFactory();
        benzCarFactory.createISportCar().run();
        benzCarFactory.createISedanCar().run();

    }
}
