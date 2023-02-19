package com.advance.mextends;


public class ExtendsDemo2 {
    public static void main(String[] args) {

        zi z = new zi();
        z.method();

        /*

            子父类中,出现了声明一模一样的方法
                        在创建子类对象,调用方法的时候,会优先使用子类的方法逻辑
                        这是就近原则的现象,但实际是:子类的方法,对父类的方法,进行了重写操作



         */
        z.show();
    }
}

class zi extends fu{
    int num = 10;

    public void method(){
        System.out.println(num);//子父类变量重名时,优先就近原则
        System.out.println(this.num);//this关键字,调用本类成员
        System.out.println(super.num);//super关键字,调用父类成员
    }

    public void show(){
        System.out.println("子类方法...show");
    }
}

class fu {
    int num = 20;

    public void show(){
        System.out.println("父类方法...show");
    }
}
