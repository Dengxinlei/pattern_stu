package com.gupaoedu.dengxinlei.pattern.strategy;

public class WechatPay extends Payment {

    private double balane = 399.99;
    public String name() {
        return "微信支付";
    }

    public double queryBalance() {
        return balane;
    }
}
