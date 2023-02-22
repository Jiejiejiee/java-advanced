package com.davance.lambda;

public class LambdaDemo1 {
    /*

        Lambda表达式 : jdk8后的一种新语法形式

            作用 : 简化匿名内部类的代码写法

            格式 : () -> {}

                    () : 匿名内部类被重写方法的形式参数
                    {} : 被重写方法的方法体

     */

    public static void main(String[] args) {

        useInterA(new InterA() {
            @Override
            public void show() {
                System.out.println("匿名内部类,重写show方法");
            }
        });

        useInterA( () -> {
            System.out.println("Lambda表达式,重写show方法");
        });

    }

    public static void useInterA(InterA a){
        a.show();
    }

}

interface InterA{
    void show();
}
