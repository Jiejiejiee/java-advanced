package com.davance.block;

public class BlockDemo {
    /*

        1.局部代码块:

                    位置:方法中的一对大括号
                    作用:限定变量的生命周期，提早释放内存

        2.构造代码块:

                    位置:类中方法外的一对大括号
                    特点:在创建对象,执行构造方法的时候,会先执行构造代码块(优先于构造方法执行)
                    作用:将多个构造方法中,重复的代码,抽取到构造代码块中,提升代码的复用性

        3.静态代码块:

                    位置:类中方法外的一对大括号,需要用static关键字
                    特点:随着类的加载而执行,类只加载一次,所以也只执行一次
                    作用:对数据进行初始化
     */
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student(10);
    }
}

class Student{

    {
        System.out.println("好好学习!");
    }

    static {
        System.out.println("student类的静态代码块.");//最先执行,且只执行一次
    }

    public Student(){
        System.out.println("空参构造方法");
    }

    public Student(int num){
        System.out.println("带参构造方法");
    }
}
