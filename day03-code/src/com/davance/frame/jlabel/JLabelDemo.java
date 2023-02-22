package com.davance.frame.jlabel;

import javax.swing.*;

public class JLabelDemo {
    /*

        JLabel(string text) 使用指定文本创建个Jlabel对象

        JLabel(Icon image) 创建一个具有指定图像的Jlabel对象

        如果多个组件摆放在同一个位置,后添加的组件会被压在底部

     */

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLayout(null);

        //JLabel展示文本
        JLabel jl1 = new JLabel("听君一席话");
        jl1.setBounds(50,50,100,100);
        frame.getContentPane().add(jl1);

        JLabel jl2 = new JLabel("如听一席话");
        jl2.setBounds(150,50,100,100);
        frame.getContentPane().add(jl2);

        //JLabel展示图片
        //ImageIcon icon = new ImageIcon("C:\\Users\\Andrian\\Pictures\\Saved Pictures\\日本东京城市夜景3440x1440壁纸_千叶网.jpg");//括号内放图片的路径
        JLabel imgJLabel = new JLabel(new ImageIcon("C:\\Users\\Andrian\\Pictures\\Saved Pictures\\日本东京城市夜景3440x1440壁纸_千叶网.jpg"));

        imgJLabel.setBounds(50,150,100,100);
        frame.getContentPane().add(imgJLabel);

        frame.setVisible(true);
    }
}
