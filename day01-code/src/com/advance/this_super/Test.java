package com.advance.this_super;

public class Test {
    /*

        开闭原则:对功能拓展做开放,对修改代码做关闭

                    this()和super()都在争夺构造方法第一行的位置,二者不能共存

     */

    public static void main(String[] args) {

        A a1 = new A(1,2,3);
        A a2 = new A(4,5,6);

        A a3 = new A(1,2,3,4);

    }

}

/**
 * 若此时新增一个成员变量,
 */
class A{
    int a;
    int b;
    int c;

    //新增一个成员变量
    int d;

    public A() {
    }

    public A(int a, int b, int c) {//不能在这直接添加新的成员变量,若直接添加和修改构造方法,之前创建的几个对象全部报错
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A(int a, int b, int c, int d) {
//        this.a = a;
//        this.b = b;
//        this.c = c;//代码过于冗余

        this(a, b, c);//用之前的构造方法处理前三个数据

        this.d = d;//自己处理新加的数据
    }
}