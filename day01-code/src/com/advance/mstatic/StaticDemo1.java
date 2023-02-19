package com.advance.mstatic;

public class StaticDemo1 {
    /*

        static 关键字:修饰符,修饰成员变量,成员方法

            特点:
                1.被类的所有对象所共享
                2.多了一种调用方式,可以通过类型进行调用
                3.随着类的加载而加载(静态成员变量区),优先于对象存在

            使用:
                1.该成员变量是否要被所有对象所共享
                2.

     */
    public static void main(String[] args) {

        //推荐使用类名调用
        Student.school = "华东交通大学";//可以放到对象前调用,优先于对象

        Student stu1 = new Student();

        stu1.name = "张三";
        stu1.age = 18;
        //stu1.school = "华东交通大学";



        System.out.println(stu1.name+"---"+stu1.age+"---"+Student.school);

        System.out.println("------------------------------");

        Student stu2 = new Student();

        stu2.name = "李四";
        stu2.age = 23;

        //stu2.school = "华东交通大学";

        System.out.println(stu2.name+"---"+stu2.age+"---"+stu2.school);

        System.out.println("------------------------------");

        Student stu3 = new Student();

        System.out.println(stu3.name+"---"+stu3.age+"---"+stu3.school);
    }

}
