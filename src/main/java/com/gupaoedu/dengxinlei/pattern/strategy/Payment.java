package com.gupaoedu.dengxinlei.pattern.strategy;

public abstract class Payment {
    public abstract String name();
    public abstract double queryBalance();

    public int pay(double amount){
        if(queryBalance() < amount) {
            System.out.println(name()+"-支付余额不足");
            return 0;
        }
        System.out.println(name() + ":"+ amount+ "支付成功");
        return 1;
    }
}
