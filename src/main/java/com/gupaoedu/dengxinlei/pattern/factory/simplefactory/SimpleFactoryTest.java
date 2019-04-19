package com.gupaoedu.dengxinlei.pattern.factory.simplefactory;

import com.gupaoedu.dengxinlei.pattern.factory.ICar;
import com.gupaoedu.dengxinlei.pattern.factory.BenzCar;
import com.gupaoedu.dengxinlei.pattern.factory.BWMCar;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        ICar sportCar = factory.create(BWMCar.class);
        sportCar.run();
        factory.create(BenzCar.class).run();
    }
}
