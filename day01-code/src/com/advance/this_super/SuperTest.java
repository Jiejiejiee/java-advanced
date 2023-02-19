package com.advance.this_super;

public class SuperTest {
    /*

        super 调用父类成员的省略规则:

                    super.父类成员变量 | super.父类成员方法()

                     ->被调用的变量和方法,在子类中不存在,super可以直接省略

     */
    public static void main(String[] args) {
        son s = new son();
        s.show();
        s.method();
    }

}

class father{
    int num = 10;

    public void show(){
        System.out.println("father...show");
    }
}

class son extends father{

    int num = 20;

    @Override
    public void show() {
        System.out.println("son...show");
    }

    public void method(){
        System.out.println(super.num);//在子类中,没有num变量,super可以省略
        System.out.println(num);
        super.show();
    }
}
