package jihe;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionList {

    public static void main(String[] args) {

        List l1 = new LinkedList();
        for (int i = 0; i <= 5; i++) {
            l1.add("a" + i);
        }
        System.out.println(l1);
        //向指定位置加一个字符串
        l1.add(0, "a100");
        System.out.println(l1);
        //替换index=6的位置的字符串
        l1.set(6, "a200");
        System.out.println(l1);
        //取index=2的位置的字符串
        System.out.println(l1.get(2) + "");
        //获得a3的index索引编号
        System.out.println(l1.indexOf("a3"));
        //移除index=1的值
        l1.remove(1);
        System.out.println(l1);
        System.out.println("=============");

        /**
         * List常用算法举例
         */

        List p1 = new LinkedList();
        for (int i = 0; i <= 9; i++) {
            p1.add("a" + i);
        }
        //打印p1[a0, a1, a2, a3, a4, a5, a6, a7, a8, a9]
        System.out.println(p1);
        //随机排列
        Collections.shuffle(p1);
        System.out.println(p1);
        //逆序
        Collections.reverse(p1);
        System.out.println(p1);
        //排序
        Collections.sort(p1);
        System.out.println(p1);
        //折半查找
        System.out.println(Collections.binarySearch(p1, "a5"));//5
    }
}
