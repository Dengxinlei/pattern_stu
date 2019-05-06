package com.gupaoedu.dengxinlei.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

public class PaymentStrategy {
    public final static String apliPay = "aliPay";
    public final static String unionPay = "unionPay";
    public final static String wechatPay = "wechatPay";
    public final static String defaultPay = "aliPay";
    static final Map<String, Payment> paymentRegistry = new HashMap<String, Payment>();
    static {
        paymentRegistry.put(apliPay, new AliPay());
        paymentRegistry.put(unionPay, new UnionPay());
        paymentRegistry.put(wechatPay, new WechatPay());
        paymentRegistry.put(defaultPay, new AliPay());
    }
    public Payment execute(String payKey) {
        if(!paymentRegistry.containsKey(payKey)) {
            return paymentRegistry.get(defaultPay);
        }
        return paymentRegistry.get(payKey);
    }
}
