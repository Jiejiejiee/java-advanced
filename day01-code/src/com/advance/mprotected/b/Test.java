package com.advance.mprotected.b;

/*

    father类和test类是处于不同包下的无关类

 */
public class Test {
    public static void main(String[] args) {
        Son s = new Son();
        /*
            调用的show方法来源于father类,且方法是受protected保护的
                 father类和test类是处于不同包下的无关类
                    ----权限不足
         */
        //s.shoe();???//不行
        s.method();

    }
}
