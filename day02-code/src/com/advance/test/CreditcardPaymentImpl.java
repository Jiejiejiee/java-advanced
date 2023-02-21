package com.advance.test;

public class CreditcardPaymentImpl implements Payment {
    @Override
    public void pay(double money) {
        System.out.println("用信用卡支付了:" + money + "元");
    }
}
