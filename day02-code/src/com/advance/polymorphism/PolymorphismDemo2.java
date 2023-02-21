package com.advance.polymorphism;

public class PolymorphismDemo2 {
    /*

        多态成员的访问特点:

            1.成员变量:编译看父类，运行看父类

            2.成员方法:编译看父类，运行看子类

                        在编译时，会先检查父类中有没有这个方法
                                    -无，编译错误
                                    -有，编译通过，运行时执行子类的方法逻辑

                                    若父类的方法为一个抽象方法，则调用无意义，所以执行子类的方法逻辑


            多态创建对象，调用静态成员 :

                        静态成员,推荐使用类名进行调用
                                -静态的成员可以通过对姓名调用,但这只是一种假象(生成字节码文件后,会自动将对象名调用,改为类名调用)


        ----------------------------------------------------------------------------------------------------------------

        多态的弊端 : 不能使用子类的特有成员

                非要使用,则需多态的转型

     */
    public static void main(String[] args) {
        Father father = new Son();
        System.out.println(father.num);//10,父类成员变量
        father.show();//子类成员方法

        System.out.println("---------------------------------");

        Inter i = new InterImpl();//实现关系，父类引用指向子类对象
        i.method();

        System.out.println("---------------------------------");

        father.show();
        father.print();//Father.print();


    }
}

class Father{
    int num = 10;

    public void show(){
        System.out.println("father...show");
    }

    public static void print(){
        System.out.println("father...");
    }
}

class Son extends Father{
    int num = 20;

    @Override
    public void show() {
        System.out.println("son...show");
    }

    public static void print(){
        System.out.println("son...");
    }
}

interface Inter{
    void method();
}

class InterImpl implements Inter{
    @Override
    public void method() {
        System.out.println("method...");
    }
}