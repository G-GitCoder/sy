package com.itheima.demo06.summary02;

import java.util.Arrays;

public class Test01 {

    public static void main(String[] args) {
        //获取一下当前系统毫秒值时间
        long time = System.currentTimeMillis();
        System.out.println(time);
        System.out.println("==================");

        //arraycopy(int[] src,int srcIndex,int[] dest,int destIndex,int count)复制数组
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.arraycopy(arr1,0,arr2,5,4);
        String s = Arrays.toString(arr2);
        System.out.println(s);
    }
}
