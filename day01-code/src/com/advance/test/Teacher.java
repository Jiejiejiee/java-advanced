package com.advance.test;

class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println("姓名为"+super.getName()+",年龄为"+super.getAge()+"的老师正在讲课");
    }
}
