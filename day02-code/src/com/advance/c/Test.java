package com.advance.c;

import com.advance.a.Student;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.eat();

        //使用全类名创建对象 : 包名+类名
        com.advance.b.Student stu2 = new com.advance.b.Student();//当不同包下有同名类时,第一个类可以导包调用,第二个只能用全类名进行调用
        stu2.study();
    }
}
