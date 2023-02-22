package com.davance.listener;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerDemo {
    /*

        键盘事件:KeyListener

     */

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {//键入某个键时,调用此方法
                //fn ctrl esc等特殊按键无法监听
            }

            @Override
            public void keyPressed(KeyEvent e) {//按下某个键时,调用此方法
                int keyCode = e.getKeyCode();
                //System.out.println("键盘按下了"+keyCode);
                if (keyCode == 37){
                    System.out.println("左移动业务代码");
                }else if (keyCode == 38){
                    System.out.println("上移动业务代码");
                }else if (keyCode == 39){
                    System.out.println("右移动业务代码");
                }else if (keyCode == 40){
                    System.out.println("下移动业务代码");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {//释放某个键时,调用此方法
                //System.out.println("键盘松开了");
            }
        });

        jFrame.setVisible(true);
    }
}
