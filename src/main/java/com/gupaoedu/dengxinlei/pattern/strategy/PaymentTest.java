package com.gupaoedu.dengxinlei.pattern.strategy;

public class PaymentTest {
    public static void main(String[] args) {
        new PaymentStrategy().execute("wechatPay").pay(1000.00);
    }
}
