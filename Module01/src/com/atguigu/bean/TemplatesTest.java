package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author DongNingqian
 * @data 2021-04-03-21:21
 *
 * 模板的位置：setting - Editor - Live Templates / postfix Completion
 * 常用的模板
 * psvm
 */
public class TemplatesTest {
    //prsf
//    private static final CUSTOMER cust1 = new Customer();
    //psf
    public static final Customer cut = new Customer();
    //psfi
    public static final int NUM = 1;
    //psfs
    public static final String NATION = "china";



    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("hello");
        //soutv
        System.out.println("args = " + Arrays.deepToString(args));
        //soutm
        System.out.println("TemplatesTest.main");
        int num1 = 10;
        //soutv
        System.out.println("num1 = " + num1);
        int num2 = 20;
        //soutv
        System.out.println("num2 = " + num2);
        //xx.sout
        System.out.println(num1);

        String[] arr = {"Tom", "Jerry", "HanMeiMei"};
        //fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr = " + arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println("s = " + s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        //list.for
        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }
    public void method(int a){
        System.out.println("a = " + a);
        System.out.println("TemplatesTest.method");

        //ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }

        Object obj = new Object();
        //xxx.null
        if (obj == null) {

        }
        //xxx.nn
        if (obj != null) {

        }
    }

    //自定义Template
    ///test
    public void testUpdate(){
        //修改的测试
    }
    //pric
    /**
    * 客户的id
    */
    private int id = 1234;
    //prsc
    /*
    * 客户的名称
    */
    private String name = "abc";

}
