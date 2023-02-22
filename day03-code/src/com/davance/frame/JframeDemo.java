package com.davance.frame;

import javax.swing.*;

public class JframeDemo {
    public static void main(String[] args) {

        //创建窗体对象
        JFrame frame = new JFrame();

        //设置窗体大小
        frame.setSize(500,800);

        //修改窗体的修改模式
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //设置窗体标题
        frame.setTitle("窗体");

        //设置窗体可见(放在最后）
        frame.setVisible(true);
    }
}
