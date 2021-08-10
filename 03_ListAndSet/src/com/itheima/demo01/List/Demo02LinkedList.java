package com.itheima.demo01.List;

import java.util.LinkedList;

/*
java.util.LinkedList集合 implements List接口
LinkedList集合的特点：
    1、底层是一个链表结构，查询慢，增删快
    2、里边包含了大量操作首尾元素的方法
    【注意】使用LinkedList集合特有的方法，不能使用多态

    public void addFirst(E e):将指定元素插入此列表的开头
    public void addLast(E e):将指定元素添加到此列表的结尾 --- 等效于add()
    public void push(E e):将元素推入此列表所表示的堆栈 --- 等效于addFirst

    public E getFirst():返回此列表的第一个元素
    public E getLast():返回此列表的最后一个元素

    public E removeFirst():移除并返回此列表的第一个元素
    public E removeLast():移除并返回此列表的最后一个元素
    public E pop():从此列表所表示的堆栈弹出一个元素 --- 等效于removeFirst

    public boolean isEmpty():如果列表不包含元素，则返回true
 */
public class Demo02LinkedList {

    public static void main(String[] args) {
        show03();
    }

    /*
    public E removeFirst():移除并返回此列表的第一个元素
    public E removeLast():移除并返回此列表的最后一个元素
    public E pop():从此列表所表示的堆栈弹出一个元素 --- 等效于removeFirst
     */
    private static void show03() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

//        String first = linked.removeFirst();
        String first = linked.pop();
        String last = linked.removeLast();
        System.out.println(linked); // [b]
        System.out.println(first); // a
        System.out.println(last); // c
    }

    /*
    public E getFirst():返回此列表的第一个元素
    public E getLast():返回此列表的最后一个元素
     */
    private static void show02() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        //linked.clear(); // 清空集合中的元素，在获取集合中的元素会抛出 NoSuchElementException

        if (!linked.isEmpty()) {
            String first = linked.getFirst();
            String last = linked.getLast();
            System.out.println(first); // a
            System.out.println(last); // c
        }
    }

    /*
    public void addFirst(E e):将指定元素插入此列表的开头
    public void addLast(E e):将指定元素添加到此列表的结尾
    public void push(E e):将元素推入此列表所表示的堆栈
     */
    private static void show01() {
        //创建LinkerList集合对象
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked); // [a, b, c]

        linked.addFirst("www");
        System.out.println(linked); // [www, a, b, c]
        linked.push("com");
        System.out.println(linked); // [com, www, a, b, c]
        linked.addLast("cn");
        System.out.println(linked); // [com, www, a, b, c, cn]
    }
}
