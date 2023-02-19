package com.advance.mextends.constructor;

public class Test {
    /*
        子类的构造方法

        在所有构造方法的第一行代码,都默认隐藏了一行super();
                                        通过此代码,访问父类的空参数构造方法 -- 完成子类继承方法中数据的初始化

        Java当中所有类,都间接或直接的继承到了 Object 类

     */

    public static void main(String[] args) {
        son s1 = new son();
        son s2 = new son(10);
    }

}

class father{
    public father(){
        super();
        System.out.println("父类的空参构造方法.");
    }

    public father(int x){
        super();
        System.out.println("父类的带参构造方法.");
    }
}

class son extends father{
    public son(){
        super();
        System.out.println("子类的空参构造方法.");
    }

    public son(int x){
        super();
        System.out.println("子类的带参构造方法.");
    }
}
