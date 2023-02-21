package com.advance.mabstract;

public class AbstractDemo2 {
    /*

        抽象类的注意事项:

                1.抽象类不能实例(创建对象)化
                        -如果抽象类允许创建对象,就可以通过对象调用内部没有方法体的抽象方法了,无意义
                2.抽象类存在构造方法
                        -交给子类,通过super进行访问
                3.抽象类中可以存在普通方法
                        -可以让子类继承以使用
                4.抽象类的子类:
                        1)要么重写抽象类中的所有抽象方法
                        2)要么是抽象类

        --------------------------------------------------------------

        abstract 关键字冲突
                final       private     static

     */

    public static void main(String[] args) {

//        Father father = new Father();

        Son s = new Son();
        s.method();

    }
}

abstract class Father {

    public Father() {

    }
    public abstract void show();

    public void method() {
        System.out.println("method...");
    }

}
class Son extends Father {

    public Son() {
        super();
    }

    @Override
    public void show() {

    }

}
abstract class A{
    public abstract void showA();
}

abstract class B extends A{
    @Override
    public void showA() {

    }

    public abstract void showB();
}

class C extends B{

    @Override
    public void showB() {

    }
}
