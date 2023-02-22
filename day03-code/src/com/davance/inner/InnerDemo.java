package com.davance.inner;

public class InnerDemo {
    /*

        内部类:在类中定义的类

                class Outer{
                    class Innet{
                    }
                }

        创建对象格式: 外部类名.内部类名 对象名 = new 外部类对象().new 内部类对象();


        成员访问细节:
                    1.内部类中,访问外部类成员 : 直接访问,包括私有
                    2.外部类中,访问内部类成员 : 需要创建对象访问

     */
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        System.out.println(oi.num);
        oi.show();

        System.out.println("--------------------------------");

        MyOuter.MyInner moi = new MyOuter().new MyInner();
        moi.show();
    }
}

class Outer{

    private void method(){
        System.out.println("method...");
        Inner i = new Inner();
        System.out.println(i.num);
    }

    class Inner{
        int num = 10;
        public void show(){
            System.out.println("show...");

            method();//直接调用外部类方法
        }
    }

}

class MyOuter{

    int num = 10;

    class MyInner{

        int num = 20;

        public void show(){
            int num = 30;

            System.out.println(num);//30

            //MyOuter.MyInner oi = new MyOuter().new MyInner();
            //System.out.println(oi.num);//20
            System.out.println(this.num);//本类成员变量

            //MyOuter o = new MyOuter();
            //System.out.println(o.num);//10
            System.out.println(MyOuter.this.num);//外部类的本类成员
        }

    }

}
