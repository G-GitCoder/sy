package com.itheima.demo03.Summary;

public class Test01 {

    public static void main(String[] args) {
        MyClass<String> my = new MyClass<>();
        my.print("hello");

        MyClass<Integer> my2 = new MyClass<>();
        my2.print(10);
        System.out.println("===================");

        MyInterImpl<String> m1 = new MyInterImpl<>();
        m1.print("world");

        MyInterImpl<Double> m2 = new MyInterImpl<>();
        m2.print(8.8);
    }
}
