package com.itheima.demo06.summary02;

public class Test02 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //append方法
        /*sb.append("abc");
        sb.append(true);
        sb.append(100);*/
        sb.append("hello").append("world").append("java");

        //reverse方法
        sb.reverse();

        //toString方法
        System.out.println(sb);
    }
}
