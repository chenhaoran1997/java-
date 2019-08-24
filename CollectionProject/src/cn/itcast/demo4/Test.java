package cn.itcast.demo4;

import java.util.ArrayList;
import java.util.List;

/*
    总结：
        泛型一般只和集合类相结合使用
        泛型是JDK5的新特性，但是从JDK7开始，后边的泛型可以不用写具体的数据类型(菱形泛型)
 */
public class Test {
    public static void main(String[] args) {
        //不使用泛型的集合
        //1.创建集合对象
        List list = new ArrayList();
        //2.创建元素对象
        //3.将元素对象添加到集合对象中
        list.add("a");
        list.add("b");
        list.add("c");
        //list.add(10);     会报类型转换异常
        //4.遍历集合
        for (Object obj : list) {
            String s = (String)obj;
            System.out.println(s);
        }
        System.out.println("---------------------");

        //需求：演示泛型
        //1.创建集合对象
        List<String> list2 = new ArrayList<>();
        //2.创建元素对象
        //3.将元素对象添加到集合对象中
        list2.add("abc");
        list2.add("bcd");
        list2.add("cde");
        //list2.add(10);
        //4.遍历集合
        for (String s : list2) {
            System.out.println(s);
        }
    }
}
