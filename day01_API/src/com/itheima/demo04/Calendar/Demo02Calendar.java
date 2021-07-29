package com.itheima.demo04.Calendar;

/*
Calendar类的成员方法：
    public int get(int field)：返回给定日历字段的值
    public void set(int field, int value)：将给定的日历字段设置为给定值
    public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量
    public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象
成员方法的参数：
    int field：日历类的字段，可以使用Calendar类的静态成员变量获取
    public static final int YEAR = 1;       年
    public static final int MONTH = 2;      月
    public static final int DATE = 5;       月中的某一天
    public static final int DAY_OF_MONTH = 5;   月中的某一天
    public static final int HOUR = 10;      时
    public static final int MINUTE = 12;    分
    public static final int SECOND = 13;    秒
 */
public class Demo02Calendar {

    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
    }
}
