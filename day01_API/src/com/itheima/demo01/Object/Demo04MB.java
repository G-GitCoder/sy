package com.itheima.demo01.Object;

public class Demo04MB {

    public static void main(String[] args) {
        String str = "abc";
//        System.out.println(str); //abc
        System.out.println(str.toString()); //abc

        Student s = new Student("张三",23);
        //System.out.println(s); //com.itheima.demo01.Object.Student@140e19d
        System.out.println(s); //Student{name='张三', age=23}
    }
}
