package com.gupaoedu.dengxinlei.pattern.factory.factorymethod;

import com.gupaoedu.dengxinlei.pattern.factory.BenzCar;
import com.gupaoedu.dengxinlei.pattern.factory.ICar;

public class BenzCarFactory implements CarFactory {
    public ICar create() {
        return new BenzCar();
    }
}
