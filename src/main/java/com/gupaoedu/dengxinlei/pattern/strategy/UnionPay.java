package com.gupaoedu.dengxinlei.pattern.strategy;

public class UnionPay extends Payment {

    private double balane = 199.99;
    public String name() {
        return "银联支付";
    }

    public double queryBalance() {
        return balane;
    }
}
