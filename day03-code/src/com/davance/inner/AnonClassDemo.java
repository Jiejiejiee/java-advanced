package com.davance.inner;

public class AnonClassDemo {
    /*

        匿名内部类 :

            匿名内部类本质是一个特殊的局部内部类(定义在方法内部)
            前提 : 需要存在一个接口或类
            格式:

                        new 接口名 / 类名 () {}

                        new 接口名(){} : 代表实现这个类
                        new 类名(){} : 代表继承这个类

     */

    public static void main(String[] args) {

//        useInter();//报错,方法的参数时接口类型,我们该传入该接口是实现类对象
        /**调用一个参数为接口的方法,做了三步
         * ①编写了一个类实现该接口
         * ②重写方法
         * ③创建实现类对象,传到方法中去
         */
        useInter(new InterImpl());

        /**使用匿名内部类
         *
         * 1.创建一个实现对象
         * 2.使用匿名内部类
         *          --仅当这个接口的抽象方法少时,才能使用匿名内部类
         */
        useInter(new Inter() {//即实现这个接口
            @Override
            public void show() {//重写方法
                System.out.println("匿名内部类...show...");
            }
        });
    }

    public static void useInter(Inter inter){
        inter.show();
    }

}

interface Inter{
    void show();
}

class InterImpl implements Inter{
    @Override
    public void show() {
        System.out.println("show...");
    }
}