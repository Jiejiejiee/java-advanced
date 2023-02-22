package com.davance.design.adapter;

public class AdapterDemo2 {
    /*

        适配器设计模式:解决接口与接口实现类之间的矛盾

                当接口的实现类不需要接口的部分方法时,可以编写接口的适配器类

                        用类继承适配器类,重写自己所需的方法

                        适配器类应该为抽象方法,不能用适配器类创建对象或调用方法

     */
    public static void main(String[] args) {

    }
}

interface 和尚{
    void 打坐();
    void 念经();
    void 撞钟();
    void 习武();
}

/**
 * class 鲁智深 implements 和尚{
 *
 *     @Override
 *     public void 打坐() {
 *
 *     }
 *
 *     @Override
 *     public void 念经() {
 *
 *     }
 *
 *     @Override
 *     public void 撞钟() {
 *
 *     }
 *
 *     @Override
 *     public void 习武() {//只要求满足这一个方法
 *
 *     }
 * }
 */

abstract class 和尚Adapter implements 和尚{

    @Override
    public void 打坐() {

    }

    @Override
    public void 念经() {

    }

    @Override
    public void 撞钟() {

    }

    @Override
    public void 习武() {

    }
}

class 鲁智深 extends 和尚Adapter{
    @Override
    public void 习武() {
        System.out.println("拳打镇关西");
        System.out.println("倒拔垂杨柳");
    }
}

class 唐僧 extends 和尚Adapter{
    @Override
    public void 打坐() {
        super.打坐();
    }

    @Override
    public void 念经() {
        super.念经();
    }

    @Override
    public void 撞钟() {
        super.撞钟();
    }
}