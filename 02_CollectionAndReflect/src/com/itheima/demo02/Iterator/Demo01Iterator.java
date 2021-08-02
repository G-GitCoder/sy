package com.itheima.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator接口：迭代器（对集合进行遍历）
    两个常用的方法：
        boolean hasNext() 如果仍有元素可以迭代，则返回true
            判断集合中还有没有下一个元素，有就返回true，没有就返回false
        E next() 返回迭代的下一个元素
            取出集合中的下一个元素
    Iterator迭代器，是一个接口，无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方法比较特殊
    Collection接口中有一个方法，叫iterator()，这个方法返回的就是迭代器的实现类对象
        Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器

    【重点】迭代器的使用步骤：
        1、使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
        2、使用Iterator接口中的方法hasNext()判断还有没有下一个元素
        3、使用Iterator接口中的方法next()取出集合中的下一个元素
 */
public class Demo01Iterator {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("迪丽热巴");
        coll.add("古力娜扎");
        coll.add("马尔扎哈");
        coll.add("萨瓦迪卡");

        //注意：Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
        Iterator<String> it = coll.iterator();

        //使用迭代器取出集合中元素的代码，是一个重复的过程，可以使用循环优化
        //不确定集合有多少元素，可以使用while循环，while(it.hasNext())
        //循环结束条件，hasNext()方法返回false
        while (it.hasNext()) {
            boolean b = it.hasNext();
            System.out.println(b);

            String s = it.next();
            System.out.println(s);
        }
        System.out.println("================");

        for (Iterator<String> it2 = coll.iterator(); it2.hasNext(); ) {
            String s = it2.next();
            System.out.println(s);
        }

        /*boolean b = it.hasNext();
        System.out.println(b); //true

        String s = it.next();
        System.out.println(s); //迪丽热巴

        b = it.hasNext();
        System.out.println(b); //true
        s = it.next();
        System.out.println(s); //古力娜扎

        b = it.hasNext();
        System.out.println(b); //true
        s = it.next();
        System.out.println(s); //马尔扎哈

        b = it.hasNext();
        System.out.println(b); //true
        s = it.next();
        System.out.println(s); //萨瓦迪卡

        b = it.hasNext();
        System.out.println(b); //false*/
//        s = it.next();
//        System.out.println(s); //NoSuchElementException，无元素异常
    }
}
