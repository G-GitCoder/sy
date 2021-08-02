package com.itheima.demo01.Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
java.lang.Object类
类Object是类层次结构的根（最顶层）类，每个类都是用Object作为超（父）类
所有对象（包括数组）都实现这个类的方法
* */
public class Demo01ToString {

    public static void main(String[] args) {
        //Person类默认继承了Object类，所以可以使用Object类中的 toString 方法
        //String toString() 返回该对象的字符串标识

        Person p = new Person("张三",18);
        String s = p.toString();
        System.out.println(s);//com.itheima.demo01.Object.Person@1b6d3586 / Person{name='张三', age=18}

        //直接打印对象的名字，其实就是调用对象的toString方法 p = p.toString();
        System.out.println(p);//com.itheima.demo01.Object.Person@1b6d3586 / Person{name='张三', age=18}

        /*
        看一个类是否重写了toString方法，直接打印这个类对应对象的名字即可
            如果没有重写toString方法，那么打印的就是对象的地址值（默认）
            如果重写了toString方法，那么就按照重写的方法打印
        * */

        Random r = new Random();
        System.out.println(r);//java.util.Random@4554617c   没有重写toString方法

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);//java.util.Scanner[delimiters=\p{javaWhitespace}...     重写toString方法

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);//[1, 2]       重写toString方法
    }
}
