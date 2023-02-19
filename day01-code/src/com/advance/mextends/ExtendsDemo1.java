package com.advance.mextends;

public class ExtendsDemo1 {
    /*

        一个Java文件可以创建多个类,但只有一个可以用public修饰
                类与类之间是平级关系,内部类除外

    ---------------------------------------------------------

        当类与类之间出,存在相同(共性)内容,并且产生了谁是谁的关系,就可以考虑用继承优化代码

     */

    public static void main(String[] args) {

        coder c = new coder();

        //c.name = "张三";

        //父类中有私有成员变量,子类可以调用响应的get和set方法
        c.setName("张三");
        c.age = 27;
        c.salary = 6000.0;

        System.out.println(c.getName() + "---" + c.age + "---" + c.salary);

    }

}

class employee {
    //String name;
    private String name;
    int age;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//两个类中有太多共性的元素,应该向上抽取一个共同的父类
class coder extends employee {
//    String name;
//    int age;
//    double salary;
}

class manager extends employee {
//    String name;
//    int age;
//    double salary;
}

