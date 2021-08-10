package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
java.util.Collections是集合工具类，用来对集合进行操作。部分方法如下：
    public static <T> void sort(List<T> list):将集合中的元素按照默认规则排序【升序】
 */
public class Demo02Sort {

    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01); // [1, 3, 2]

        //public static <T> void sort(List<T> list):将集合中的元素按照默认规则排序【升序】
        Collections.sort(list01);//默认是升序
        System.out.println(list01); // [1, 2, 3]

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("c");
        list02.add("a");
        list02.add("b");
        System.out.println(list02); // [c, a, b]

        //public static <T> void sort(List<T> list):将集合中的元素按照默认规则排序【升序】
        Collections.sort(list02);//默认是升序
        System.out.println(list02); // [a, b, c]
    }
}
