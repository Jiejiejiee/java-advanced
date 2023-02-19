package com.advance.test;

public class Test2 {
    public static void main(String[] args) {

        Coder coder = new Coder("张三",28,12000.0);
        coder.work();

        Manager manager = new Manager("李四",34,23000,5000);
        manager.work();

    }
}
