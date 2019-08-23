package cn.itcast.demo2;

import java.util.ArrayList;
import java.util.List;

/*
    增强for格式：
        for(元素的数据类型 变量名 ：要遍历的数组或者集合对象){
            //循环体，变量也就是元素
        }
    快捷方式：
        iter --> 回车

    注意：
        增强for的底层依赖的是迭代器(Interator)
        增强for就是迭代器的简写形式
 */
public class Test {
    public static void main(String[] args) {
        //需求：通过增强for遍历List集合。
        //1.创建集合对象
        List list = new ArrayList();
        //2.创建元素对象
        //3.将元素对象添加到集合对象中
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);

        //4.遍历集合
        for (Object obj : list){
            //obj是集合中的元素，其本身应该是Integer类型的数据
            Integer ii = (Integer)obj;
            System.out.println(obj);
        }

        System.out.println("--------------------");

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
