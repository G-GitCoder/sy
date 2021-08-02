package com.itheima.demo04.summary01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

    public static void main(String[] args) throws ParseException {
        //空参构造方法
        Date d = new Date();
        System.out.println(d);//Fri Jul 30 11:44:46 CST 2021
        System.out.println(d.toLocaleString());//2021-7-30 11:44:46

        //有参构造方法
        Date d1 = new Date(1000L);
        System.out.println(d1);//Thu Jan 01 08:00:01 CST 1970
        System.out.println(d1.toLocaleString());//1970-1-1 8:00:01

        //创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = sdf.format(d1);
        System.out.println(format); // 1970年01月01日 08:00:01

        String str = "2088年08月08日 08:08:08";
        Date parse = sdf.parse(str);
        System.out.println(parse); // Sun Aug 08 08:08:08 CST 2088
    }
}
