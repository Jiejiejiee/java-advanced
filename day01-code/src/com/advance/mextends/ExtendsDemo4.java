package com.advance.mextends;

public class ExtendsDemo4 {
    /*

        Java只支持单继承，不支持多继承(即父亲只有一个,儿子可以有多个),但支持多层继承

        java的继承体系，应该从最顶层开始学起

     */

    public static void main(String[] args) {

        c c = new c();
        c.methodc();
        c.methodb();
        c.methoda();
    }


}

class a{
    public void methoda(){
        System.out.println("a...");
    }
}

class b extends a{
    public void methodb(){
        System.out.println("b...");
    }
}

class c extends b{
    public void methodc(){
        System.out.println("c...");
    }
}


