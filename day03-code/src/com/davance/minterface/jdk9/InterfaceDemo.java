package com.davance.minterface.jdk9;

public class InterfaceDemo {
    /*

        jdk9接口特性:
                接口中允许定义私有方法

     */
    public static void main(String[] args) {

    }
}

interface Inter{
    void show();
    void print();

    /**
     *     private void log(){//该方法只只能在jdk9版本后使用
     *         System.out.println("日志记录");
     *     }
     */
    default void log(){//该方法只希望被start和end方法所用,即隐藏起来
        System.out.println("日志记录");
    }

    public default void start(){
        System.out.println("start方法执行...");
//        System.out.println("日志记录");//
        log();
    }

    public default void end(){
        System.out.println("end方法执行...");
//        System.out.println("日志记录");//两个默认方法中有重复的逻辑执行
        log();
    }
}
