package com.itheima.demo03.Summary;

public class MyInterImpl<O> implements MyInter<O> {
    @Override
    public void print(O o) {
        System.out.println(o);
    }
}
