package com.advance.mextends;

public class ExtendsDemo3 {
    /*

        方法重载(overload):在同一个类中,方法名相同,参数不同,与返回值无关

        方法重写(override):在子父类中,出现了方法声明一模一样的方法(方法名,参数,返回值)
                            -注解:在方法上方加上@override,之要不报错,那就是方法重写

                            -场景:当子类需要父类的方法,但需要对父类的方法进行修改或增强,便可以进行重写

                --------------------------------------------

                    父类中私有方法不能重写
                    子类在重写方法时,访问权限必须大于等于父类

     */
    public static void main(String[] args) {

        Son s = new Son();
        s.method();

        s.love();

    }
}

class father{

    public void method(){
        System.out.println("father...method..");
    }

    public void love(){
        System.out.println("送花");
        System.out.println("唱歌");
        System.out.println("求婚");
    }
}

class Son extends father{
    @Override
    public void method(){//方法重写
        System.out.println("son...method..");
    }

//    public void method(){
//        System.out.println("father...method..");
//    }
    //相当于把父类的方法也拿了过来,在同一个类中,构成了方法重载
    public void method(int num){//方法重载
        System.out.println("son...method..");
    }

    @Override
    public void love() {
//        super.love();//输入父类的方法名,子类自动补全方法重写 或者 快捷键选择override method
        System.out.println("吃饭");
        System.out.println("看电影");
        System.out.println("表白");

    }
}