package com.advance.minterface;

public class InterfaceDemo3 {
    /*

        接口和类之间的各种关系:

            1.类和类之间:继承关系,只支持单继承,不支持多继承,但可以多层继承

            2.类和接口之间:实现关系,可以单实现,也可以多实现,甚至可以在继承一个类的同时,实现多个接口

            3.接口和接口之间:继承关系,可以单继承,也可以多继承

     */
    public static void main(String[] args) {
        ABImpl ab =
                new ABImpl();
        ab.showA();
        ab.showB();
    }
}

interface A{
    void showA();
}

interface B{
    void showB();
}

class ABImpl implements A,B{//多实现需要重写所有接口的所有方法
    @Override
    public void showA() {
        System.out.println("学习Java");
    }

    @Override
    public void showB() {
        System.out.println("学习Python");
    }
}

class Father{
    public void show(){
        System.out.println("father...show");
    }
}

class Son extends Father implements A,B{

    @Override
    public void showA() {

    }

    @Override
    public void showB() {

    }
}

interface InterA{
    void showA();
}

interface InterB{
    void showB();
}

interface InterC extends InterA,InterB{
    void showC();
}

class InterCImpl implements InterC{

    @Override
    public void showA() {
        
    }

    @Override
    public void showB() {

    }

    @Override
    public void showC() {

    }
}