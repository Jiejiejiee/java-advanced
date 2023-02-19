package com.advance.tools;

public class Test {

    public static void main(String[] args) {

        int[] arr = {11,22,33,44,55,66};

        //ArrayTools.print(arr);
//        ArrayTools tools = new ArrayTools();

        //若在ArrayTools中定义的是public static void则对象无法调用该方法
//        System.out.println(tools.getMax(arr));
//        System.out.println(tools.getMin(arr));
//        tools.print(arr);

        System.out.println(ArrayTools.getMax(arr));
        System.out.println(ArrayTools.getMin(arr));
        ArrayTools.print(arr);

    }

}
