package com.advance.tools;


//工具类,本身无法直接运行,仅提供方法以调用
public class ArrayTools {
    /*

        1.成员方法什么时候加入 static:
                --常用于制作工具类

        2.工具类:不是描述事物的,而是定义方法调用以解决问题的

        3.如果发现一个类中,所有的方法都是static修饰的
                --私有化该类的构造方法,防止其他类再创建对象

    --------------------------------------------------------

        static方法中,只能访问静态成员(直接访问)

        static方法中不允许使用this关键字

     */

    //将所有的方法加上定义static,就可以直接用类调用方法,不需要再创建对象,再由对象调用成员方法

    //防止使用者继续创建对象,浪费内存空间,可以将创建对象方法私有化
    private ArrayTools(){};

    public static int getMax(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {

                max = array[i];

            }
        }
        return max;
    }

    public static int getMin(int[] array) {

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {

                min = array[i];

            }
        }
        return min;
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "]");
    }

}
