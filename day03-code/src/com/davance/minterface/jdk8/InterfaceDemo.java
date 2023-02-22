package com.davance.minterface.jdk8;

public class InterfaceDemo {
    /*

        jdk8版本接口特性：

                1.允许定义非抽象方法，需要加入default关键字

                        --解决接口升级问题(加入新的方法)

                2.允许定义静态方法
                        --接口中的静态方法，只允许用接口名进行调用，不允许实现类通过对象调用

     */
    public static void main(String[] args) {
        AInterImpl aInter = new AInterImpl();
        aInter.method();

        Inter.function();
    }
}

interface Inter{
    void show();
    void print();

    //在此新增一个方法，则所有的实现类都报错 -- 编写一个默认方法
    //                  --不许需要大批量修改实现类


    //若有多个接口，且其中的方法重名，则实现类会强制要求重写方法
    public default void method(){
        System.out.println("Inter...method");
    }

    public static void function(){
        System.out.println("Inter...static...function");
    }
}

class AInterImpl implements Inter{

    @Override
    public void show() {
        System.out.println("AInterImpl...show");
    }

    @Override
    public void print() {
        System.out.println("AInterImpl...print");
    }


}

class BInterImpl implements Inter{

    @Override
    public void show() {
        System.out.println("BInterImpl...show");
    }

    @Override
    public void print() {
        System.out.println("BInterImpl...print");
    }
}