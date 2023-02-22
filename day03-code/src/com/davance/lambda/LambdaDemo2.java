package com.davance.lambda;

public class LambdaDemo2 {
    /*

        Lambda表达式,只允许操作函数式编程接口 : 有且仅有一个抽象方法的接口

     */

    public static void main(String[] args) {

        useInterB(new InterB() {
            @Override
            public void show1() {
                System.out.println("匿名内部类...show1...");
            }

            @Override
            public void show2() {
                System.out.println("匿名内部类...show2...");
            }
        });

//        useInterB( () -> {} );//有多个抽象方法

    }

    public static void useInterB(InterB b){
        b.show1();
        b.show2();
    }

}

//@FunctionalInterface//不报错就是函数式编程接口,反之
interface InterB{
    void show1();
    void show2();
}
