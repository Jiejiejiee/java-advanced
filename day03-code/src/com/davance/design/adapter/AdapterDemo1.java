package com.davance.design.adapter;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AdapterDemo1 {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.addKeyListener(new KeyListenerAdapter() {//键盘监听器自己带有一个适配器KeyAdapter(),可直接调用
//            @Override
//            public void keyTyped(KeyEvent e) {
//
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                System.out.println("键盘被按下了");
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//
//            }


            @Override
            public void keyPressed(KeyEvent e) {
                //super.keyPressed(e);
                System.out.println("键盘被按下了");
            }
        });

        jFrame.setVisible(true);

    }

}

class KeyListenerAdapter implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
