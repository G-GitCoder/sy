package com.itheima.demo02.Iterator;

import java.util.ArrayList;

/*
增强for循环（for each循环）：【专门用来遍历数组和集合】
    JDK1.5之后出现的新特性，一个高级for循环
    内部原理是一个Iterator迭代器，在遍历过程中，不能对集合的元素进行增删操作

    Collection<E> extends Iterable<E>:所有的单列集合都可以使用增强for
    public interface Iterable<T> 实现这个接口允许对象成为 foreach 语句的目标

    格式：
    for(集合/数组的数据类型 变量名: 集合名/数组名){
        sout(变量名);
    }
 */
public class Demo02ForEach {

    public static void main(String[] args) {
        demo02();
    }

    //使用增强for循环遍历集合
    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for (String s : list) {
            System.out.println(s);
        }
    }

    //使用增强for循环遍历数组
    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
