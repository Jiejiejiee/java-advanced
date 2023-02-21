package com.advance.minterface;

public class InterfaceDemo1 {
    /*

        接口 : 体现思想就是声明[规则]

        思路 : 如果发现一个类,所有的组成,都是抽象方法
                -没有成员变量
                -没有普通方法

                    这种类我们设计为Java中的接口,这个类存在的唯一价值是声明规则

    --------------------------------------------------------------------------

        接口的定义强度:

                interface 接口名 {}

        接口是不允许实例化的

        接口和类是实现与被实现关系,通过implement关键字完成

                class 类名 implements 接口名 {}

                实现接口的类,成为实现类(接口的子类)

                        -重写所有的抽象方法
                        -将现实类变成抽象类
     */
    public static void main(String[] args) {
        //创建实现类对象
        InterImpl inter = new InterImpl();
        inter.show();
        inter.method();
    }
}

interface Inter{

//    public void show(){}//报错,接口中只允许有抽象方法
    public abstract void show();
    public abstract void method();
}

class InterImpl implements Inter{
    @Override
    public void show() {
        System.out.println("show...");
    }

    @Override
    public void method() {
        System.out.println("method...");
    }
}

abstract class InterImpl2 implements Inter{

}