package com.atguigu.bean;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;


/*
查看源码 ctrl+左键点击 或 ctrl+shift+t
退回前一个编辑的页面  alt+left
进入下一个编辑页面 alt+right
查看继承关系  F4
格式化代码 ctrl+shift+f
撤销 ctrl+z
反撤销 ctrl+y
查看类的结构，类似eclipse的outline ctrl+o
重构：修改所有的变量名和方法名 alt+shift+r eg：list =》 list11, method => method1
收起所有的方法 alt+shift+c
打开所有的方法 alt+shift+x
打开硬盘所在的文件位置 ctrl+shift+x
try-catch/if-else/do-while/synchronise...包围（surround） alt+shift+z
查找/替换（当前） ctrl+f
查找/替换（全局） ctrl+h
查找文件 double shift
查看类的继承结构图（Show UML Diagram） ctrl+shift+u
查看方法的重写结构（method hierarchy） ctrl+alt+h

*/

public class Customer extends Person{
    public static void main(String[] args) {
        System.out.println("Hello!!!!!!");
        //ctrl+shit+enter 在光标的上一行，新开一行写代码
        System.out.println("Hello!!!!!!");//ctrl+alt+down 向下复制一行
        System.out.println("Hello!!!!!!");//ctrl+alt+down
        //shift+enter 在光标所在行的下一行，新开一行空白行，写代码
        System.out.println("Hello!!!!!!");
        System.out.println("Hello!!!!!!");
        System.out.println("Hello!!!!!!");
        System.out.println("Hello!!!!!!");//ctrl+d 删除一行


        ArrayList list11 = null; //alt+down / alt+up 向下、向上移动行

/*        ArrayList list11 = null; //ctrl+shift+/  多行注释
        synchronized ()*/

        Date date = new Date(); //alt+enter 万能解错/生成返回值变量

        list11.add(0,123); //ctrl+alt+/ 提示方法的参数类型

        method1();
    }
    public static void method1(){
        try {
            FileInputStream fileInputStream = new FileInputStream("abc.txt");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
    void eat(){
        System.out.println("Customer is eating");
    }
}
