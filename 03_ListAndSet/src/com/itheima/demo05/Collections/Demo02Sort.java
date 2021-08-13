package com.itheima.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
java.util.Collections是集合工具类，用来对集合进行操作。部分方法如下：
    public static <T> void sort(List<T> list):将集合中的元素按照默认规则排序【升序】

【注意】
sort(List<T> list) 使用的前提：
被排序的集合里边存储的元素，必须实现Comparable，重写接口中的方法compareTo，定义排序的规则
Comparable接口的排序规则：
    自己(this) - 参数：升序
    参数 - 自己(this)：降序
 */
public class Demo02Sort {

    public static void main(String[] args) {
        //Integer 类型
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01); // [1, 3, 2]

        //public static <T> void sort(List<T> list):将集合中的元素按照默认规则排序【升序】
        Collections.sort(list01);//默认是升序
        System.out.println(list01); // [1, 2, 3]

        //String 类型
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("c");
        list02.add("a");
        list02.add("b");
        System.out.println(list02); // [c, a, b]

        //public static <T> void sort(List<T> list):将集合中的元素按照默认规则排序【升序】
        Collections.sort(list02);//默认是升序
        System.out.println(list02); // [a, b, c]

        //自定义类型 Person
        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("迪丽热巴",18));
        list03.add(new Person("古力娜扎",19));
        list03.add(new Person("马尔扎哈",15));
        System.out.println(list03); // [Person{name='迪丽热巴', age=18}, Person{name='古力娜扎', age=19}, Person{name='马尔扎哈', age=18}]

        Collections.sort(list03);
        System.out.println(list03); // [Person{name='马尔扎哈', age=15}, Person{name='迪丽热巴', age=18}, Person{name='古力娜扎', age=19}]

    }
}
