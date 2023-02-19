package com.advance.test;

public class Coder extends Employee{
    public Coder() {
    }

    public Coder(String name, int age, double salary) {
        super(name, age, salary);
    }

//    public void work(){
//        System.out.println("姓名为"+super.getName()+",年龄为"+super.getAge()+",工资为"+super.getSalary()+"的程序员正编写代码");
//    }

    //直接输入work调用父类中的方法,再进行重写


    @Override
    public void work() {
        System.out.println("姓名为"+super.getName()+",年龄为"+super.getAge()+",工资为"+super.getSalary()+"的程序员正编写代码");
    }
}
