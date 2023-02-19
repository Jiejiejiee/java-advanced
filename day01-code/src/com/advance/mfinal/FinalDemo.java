package com.advance.mfinal;

public class FinalDemo {
    /*

        final : 修饰符,可用于修饰方法,类,变量

                1.修饰方法:表面该方法时最终方法,不能被重写
                2.修饰类:表明该方法是最终类,不能被继承
                3.修饰变量:表明该变量是常量,不能再次被赋值

                        final修饰变量时的命名规则：

                                如果变量名是一个单词，所有字母大写  max MAX
                                如果变量名是多个单词，所有字母大写，中间用下划线分隔 maxvalue MAX_VALUE

    -----------------------------------------------------------

                基本数据类型 :数据值不可改变
                引用数据类型 :地址值不可改变,但内容可改变

    -----------------------------------------------------------

        final修饰成员变量:

                1.不允许修饰默认值
                2.final修饰成员变量的初始化时机

                        1)在定义时直接赋值
                        2)在构造方法中完成赋值

     */
    public static void main(String[] args) {
//        son s = new son();
//        s.method();

        final int num = 10;
//        num = 20;//num前加上修饰符,赋值语句立刻报错


    }

}

final class father{//若父类中所有方法都不希望子类继承重写,那么直接将父类用final修饰,该类也无法拥有子类,但可以有父类
    public void method(){
        System.out.println("父类中非常重要的方法.不希望子类进行修改");
    }

    public void show(){

    }

    public void print(){

    }
}
    //父类加上final修饰符,子类继承立刻报错
//class son extends father{
//
//    //父类方法加上final修饰符,子类方法重写立刻报错
////    @Override
////    public void method() {
////        System.out.println("方法重写成功.");
////    }
//}

class Student{

    final int id;

    public Student(){
        id = 20;//final修饰的成员变量后期一定要赋值
    }

}