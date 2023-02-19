package com.advance.mstatic;

public class StaticDemo2 {
    /*

                static方法中,只能访问静态成员(直接访问)

                static方法中,不允许使用this关键字

     */

    static int num1 = 10;

    int num2 = 20;

    public static void main(String[] args) {

        //在静态方法中,只能使用静态成员(直接访问)
        System.out.println(num1);
        method();

        //在静态方法中,访问非静态成员
//        System.out.println(num2);
//        print();

        //直接报错,此时应该新建一个对象,通过对象访问成员变量和方法
        StaticDemo2 sd = new StaticDemo2();
        System.out.println(sd.num2);
        sd.print();
    }

    public static void method(){
        System.out.println("static...method");
    }

    public void print(){
        System.out.println("print...");
    }

}
