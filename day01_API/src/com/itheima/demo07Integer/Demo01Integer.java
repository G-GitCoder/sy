package com.itheima.demo07Integer;

/*
装箱：把基本类型的数据，包装到包装类中（基本类型的数据->包装类）
    构造方法：
        Integer(int value) 构造一个新分配的Integer对象，他表示指定的int值
        Integer(String s) 构造一个新分配的Integer对象，他表示String参数所指示的int值
            传递的字符串，必须是基本类型的字符串，否则会抛出异常。如 “100”正确 “a”抛异常
    静态方法：
        static Integer valueOf(int i) 返回一个表示指定的int值的 Integer 实例
        static Integer valueOf(String s) 返回保存指定的String的值的 Integer 对象
拆箱：在包装类中取出基本类型的数据（包装类->基本类型的数据）
    成员方法：
        int intValue() 以int类型返回该Integer的值

 */
public class Demo01Integer {

    public static void main(String[] args) {
        //装箱：把基本类型的数据，包装到包装类中（基本类型的数据->包装类）
        //构造方法
        Integer in1 = new Integer(1);
        System.out.println(in1); //1，说明重写了toString方法

        Integer in2 = new Integer("2");
        System.out.println(in2); //2

        //静态方法
        Integer in3 = Integer.valueOf(3);
        System.out.println(in3); //3

//        Integer in4 = Integer.valueOf("a"); //NumberFormatException 数字格式化异常
        Integer in4 = Integer.valueOf("4"); //4
        System.out.println(in4);

        //拆箱：在包装类中取出基本类型的数据（包装类->基本类型的数据）
        int i = in4.intValue();
        System.out.println(i); //4
    }
}
