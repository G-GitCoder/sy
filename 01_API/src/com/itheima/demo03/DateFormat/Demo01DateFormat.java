package com.itheima.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text.DateFormat：是日期/时间格式化子类的抽象类
作用：格式化（日期-->文本）、解析（文本-->日期）
成员方法：
    String format(Date date)：按照制定的模式，把Date日期格式化为符合模式的字符串
    Date parse(String source)：把符合模式的字符串，解析为Date日期

DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类
java.text.SimpleDateFormat extends DateFormat
构造方法：
    SimpleDateFormat(String pattern) 用给定的模式和默认语言环境的日期格式符合构造 SimpleDateFormat
    参数：String pattern 用来传递制定的模式
    模式：区分大小写的
        y   年
        M   月
        d   日
        H   时
        m   分
        s   秒
    写对应的模式，会把模式替换为对应的日期和时间
        "yyyy-MM-dd HH:mm:ss"
        "yyyy年MM月dd日 HH时mm分ss秒"
    【注意】模式中的字母不能更改，连接模式的符号可以改变
 */
public class Demo01DateFormat {

    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    /*
    使用DateFormat类中的方法parse，把文本解析为日期
    Date parse(String source)：把符合模式的字符串，解析为Date日期
    使用步骤：
        1、创建SimpleDateFormat对象，构造方法中传递指定的模式
        2、调用SimpleDateFormat对象中的方法parse，把符合构造方法中模式的字符串，解析为Date日期
    注意：
        public Date parse(String source) throws ParseException
        parse方法声明了一个异常叫ParseException解析异常
        如果字符串和构造方法中的模式不一样，那么程序就会抛出异常
        调用一个抛出了异常的方法，就必须得处理这个异常，要么throws继续声明抛出这一个异常，要么try...catch自己处理这个异常
     */
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2021-07-29 17:44:11");
        System.out.println(date);
    }

    /*
    使用DateFormat类中的方法format，把日期格式化为文本
    String format(Date date)：按照制定的模式，把Date日期格式化为符合模式的字符串
    使用步骤：
        1、创建SimpleDateFormat对象，构造方法中传递指定的模式
        2、调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串（文本）
     */
    private static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(date); //Thu Jul 29 17:44:11 CST 2021
        System.out.println(text); //2021-07-29 17:44:11
    }
}
