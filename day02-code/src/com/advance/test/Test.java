package com.advance.test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请选择支付方式:  1.支付平台支付    2.银行卡支付   3.信用卡支付");
        int choice = sc.nextInt();

        Payment payment = null;//接口的引用,设置初始值

        switch (choice){
            case 1:
                payment = new PlatformPaymentImpl();
                break;

            case 2:
                payment = new BankcardPaymentImpl();
                break;

            case 3:
                payment = new CreditcardPaymentImpl();
                break;
        }

        System.out.println("请输入支付金额:");
        double money = sc.nextDouble();
        payment.pay(money);
    }


}
