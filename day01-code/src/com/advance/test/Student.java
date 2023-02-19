package com.advance.test;

public class Student extends Person {

    private double score;//子类继承完父类后,若有自己的私有属性,则需自己设立get和set方法

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public Student() {
    }

    public Student(String name, int age, double score) {
        super(name, age);//父类有的属性可以自己用父类方法进行初始化
        this.score = score;//父类没有的属性则自己初始化
    }

    public void study(){
        System.out.println("姓名为"+super.getName()+",年龄为"+super.getAge()+"成绩为"+this.getScore()+"的学生正在学习");
    }
}
