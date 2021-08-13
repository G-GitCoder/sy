package com.itheima.demo03.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
java.util.LinkedHashMap<K,V> extends HashMap<K,V>
Map接口的哈希表和链表实现，具有可预知的迭代顺序
底层原理：
    哈希表+链表（记录元素的顺序）
 */
public class Demo01LinkedHashMap {

    public static void main(String[] args) {
        //HashMap的key不允许重复，元素无序
        HashMap<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println(map); // {a=d, b=b, c=c}

        //LinkedHashMap的key不允许重复，元素有序
        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();
        map1.put("a","a");
        map1.put("c","c");
        map1.put("b","b");
        map1.put("a","d");
        System.out.println(map1); // {a=d, c=c, b=b}
    }
}
