package com.itheima.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    boolean add(E e):向集合中添加元素
    boolean remove(E e):删除集合中的某个元素
    void clear():清空集合中所有的元素
    boolean contains(E e):判断当前集合中是否包含某个元素
    boolean isEmpty():判断当前集合是否为空
    int size():返回集合中元素的个数
    Object[] toArray():将集合转成一个数组
 */
public class Test01 {

    public static void main(String[] args) {
        //创建集合对象
        Collection<String> coll = new ArrayList<>();
        //boolean add(E e):向集合中添加元素
        coll.add("hello");
        coll.add("world");
        coll.add("heima");
        coll.add("java");
        System.out.println(coll); //[hello, world, heima, java]

        //boolean remove(E e):删除集合中的某个元素
        boolean result = coll.remove("hello");
        System.out.println(result); //true
        System.out.println(coll); //[world, heima, java]

        //void clear():清空集合中所有的元素
//        coll.clear();
//        System.out.println(coll); //[]

        //boolean contains(E e):判断当前集合中是否包含某个元素
        boolean con = coll.contains("java");
        System.out.println(con); //true

        //boolean isEmpty():判断当前集合是否为空
        System.out.println(coll.isEmpty());

        //int size():返回集合中元素的个数
        System.out.println(coll.size()); //3

        //Object[] toArray():将集合转成一个数组
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
