package com.advance.polymorphism;

public class PolymorphismDemo1 {
    /*

        多态的前题:

                    有继承/实现关系
                    有方法重写
                    有父类引用指向子类对象

        1.对象多态

                Animal dog2 = new Dog();//父类引用指向子类对象
                Animal cat = new Cat();

                方法的形参定义为父类类型,这个方法就可以接收到该父类的任意子类对象了

        2.行为多态

                同一个方法,具有多种不通表现形式或形态

     */
    public static void main(String[] args) {
        Dog dog1 = new Dog();//子类引用指向子类对象

        //创建对象时,左右两边可以是不同的类型,但必须是父类引用指向子类对象 -- 对象多态
        Animal dog2 = new Dog();//父类引用指向子类对象
        Animal cat = new Cat();

        //既能接收狗对象,也能接收猫对象
        useAnimal(new Dog());//Animal dog2 = new Dog();
        useAnimal(new Cat());//Animal cat = new Cat();

    }

    //行为多态的运用
    public static void useAnimal(Animal animal){
        //传入不通的对象,有不同的表现形式
        animal.eat();//同一个方法
    }


}


abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}