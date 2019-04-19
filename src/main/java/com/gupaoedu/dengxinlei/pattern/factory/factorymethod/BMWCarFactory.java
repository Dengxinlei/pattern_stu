package com.gupaoedu.dengxinlei.pattern.factory.factorymethod;

import com.gupaoedu.dengxinlei.pattern.factory.BWMCar;
import com.gupaoedu.dengxinlei.pattern.factory.ICar;
import com.gupaoedu.dengxinlei.pattern.factory.BenzCar;

public class BMWCarFactory implements CarFactory {
    public ICar create() {
        return new BWMCar();
    }
}
