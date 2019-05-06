package com.gupaoedu.dengxinlei.pattern.strategy;

public class AliPay extends Payment {

    private double balane = 299.99;
    public String name() {
        return "支付宝";
    }

    public double queryBalance() {
        return balane;
    }
}
