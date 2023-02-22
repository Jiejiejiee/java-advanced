package com.davance.frame.button;

import javax.swing.*;

public class JButtonDemo {
    /*

        JButton 构造方法:

            1.public JButton() : 创建一个空白的按钮
            2.public JButton(String Text) : 创建一个带文本的按钮

     */

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消窗体默认布局,如果取消了默认布局,就需要手动指定组件的摆放位置
        jFrame.setLayout(null);

        //创建按钮对象
        JButton btn = new JButton("点我啊~");

        //设置按钮位置
        btn.setBounds(50,50,100,100);

        //将按钮对象添加到窗体的[面板对象]
        jFrame.getContentPane().add(btn);


        /**取消按键焦点
         * 当键盘和按钮起冲突时,一般走按钮逻辑方法,按钮默认为程序的焦点
         * 取消按钮为焦点
         */
        btn.setFocusable(false);

        jFrame.setVisible(true);

    }
}
