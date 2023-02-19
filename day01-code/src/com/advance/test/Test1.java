package com.advance.test;

import com.sun.deploy.panel.ITreeNode;

public class Test1 {
    /*

        老师类:
                成员变量:姓名,年龄
                成员方法:teach  - 姓名为张三,年龄为30的老师正在讲课

        学生类:
                成员变量:姓名,年龄,成绩
                成员方法:study - 姓名为李四,年龄为18岁,成绩100分的学生,正在学习


     */
    public static void main(String[] args) {

        Teacher t = new Teacher("张三",30);
        t.teach();

        Student s = new Student("李四",18,100.0);
        s.study();

    }
}

