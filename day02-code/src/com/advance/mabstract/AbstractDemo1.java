package com.advance.mabstract;

public class AbstractDemo1 {
    /*

        抽象类 : 特殊的父类

                    -内部允许编写抽象方法

        定义格式:

                                public abstract 返回值类型 方法名(参数列表);

                                public abstract class 类名{}


            抽象方法 : 当我们将共性的方法,抽取到父类之后,发现这个方法在父类中无法给出具体明确(描述不清了),无法考虑到具体实现
                            而且这个方法,还是子类中必须要有的方法,就可以设计为抽象方法

     */

    public static void main(String[] args) {

        Cat c = new Cat();
        c.eat();

        Dog d = new Dog();
        d.eat();

    }

}

abstract class Animal{//②
    public abstract void eat();//抽象方法要存储在抽象类中①
}
class Cat extends Animal{//该方法在抽象类中描述不清,在具体类中则需描述清楚,相当于方法重写③
//    public void eat(){
//        System.out.println("猫吃鱼");
//    }


    @Override
    public void eat() {//④
        System.out.println("猫吃鱼");
    }
}

class Dog extends Animal{
//    public void eat(){
//        System.out.println("狗吃肉");
//    }


    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
