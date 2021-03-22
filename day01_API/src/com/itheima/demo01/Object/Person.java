package com.itheima.demo01.Object;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    直接打印对象的地址值没有意义，需要重写Object类的toString方法
    打印对象的属性（name, age）
    * */

/*    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/

/*    @Override
    public String toString() {
        //return "abc";
        return "Person{name='" + name + ", age=" + age + '}';
    }*/

    /*
    Object类的equals方法默认比较的是两个对象的地址值，没有意义
    所以我们需要重写equals方法，比较两个对象的属性值(name, age)
        对象的属性值一样，返回true; 否则返回false

    问题：隐含着一个多态
    Object obj = p2 = new Person("古力娜扎",18);
    多态的弊端：无法使用子类特有的内容（属性，方法）
    解决：可以使用向下转型（强转），把Object类型转换为Person
    * */

    @Override
    public boolean equals(Object obj) {

        //增加一个判断，传递的参数obj是null，直接返回false，提高程序的效率
        if(obj == null) {
            return false;
        }

        //增加一个判断，是Person类型再转换，防止类型转换异常ClassCastException
        if(obj instanceof Person) {
            //使用向下转型（强转），把Object类型转换为Person
            Person p = (Person) obj;

            //比较两个对象的属性：一个是调用方法的this(p1)，一个就是p(obj = p2)
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }

        //不是Person类型直接返回false
        return false;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return age == person.age &&
                Objects.equals(name, person.name);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
