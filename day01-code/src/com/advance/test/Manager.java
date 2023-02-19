package com.advance.test;

public class Manager extends Employee{

    private double reward;

    public Manager(double reward) {
        this.reward = reward;
    }

    public Manager(String name, int age, double salary, double reward) {
        super(name, age, salary);
        this.reward = reward;
    }

//    public void work(){
//        System.out.println("姓名为"+super.getName()+",年龄为"+super.getAge()+",工资为"+super.getSalary()+"奖金为"+this.reward+"的项目经理正在分配任务");
//    }


    @Override
    public void work() {
        System.out.println("姓名为"+super.getName()+",年龄为"+super.getAge()+",工资为"+super.getSalary()+"奖金为"+this.reward+"的项目经理正在分配任务");
    }

}
