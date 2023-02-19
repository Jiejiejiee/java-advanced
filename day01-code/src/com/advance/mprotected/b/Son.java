package com.advance.mprotected.b;

import com.advance.mprotected.a.Father;

public class Son extends Father {
    /*

        不同包下的子类:即在子类的大括号下进行访问

     */

    public void method(){
        super.show();
    }
}
