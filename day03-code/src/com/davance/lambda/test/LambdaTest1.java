package com.davance.lambda.test;

public class LambdaTest1 {
    /*

            Lambda表达式的省略写法:

                1.参数类型可以省略不写
                2.如果只有一个参数,参数类型可以省略,同时()也可以省略
                3.如果Lambda表达式的方法体只有一行代码
                        -大括号可以不写,同时也要省略分号;
                        -如果这行代码是return语句,必须省略return,同时省略分号

     */
    public static void main(String[] args) {

        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("匿名内部类,重写后的show方法...");
            }
        });

        System.out.println("----------------------------------------------");

        useShowHandler( () -> {
            System.out.println("Lambda表达式,重写后的show方法...");
        });

        System.out.println("----------------------------------------------");

        useShowHandler(() -> System.out.println("省略后的Lambda表达式,重写后的show方法..."));

    }

    public static void useShowHandler(ShowHandler showHandler){
        showHandler.show();
    }

}

interface ShowHandler{
    void show();
}