package cn.itcast.demo1;

import java.util.ArrayList;
import java.util.List;

/*
    单列集合（Collection）之List集合：
    特点：
        有序（元素的存取顺序一致），可重复
    注意：
        List是接口，所以可以通过创建其子类ArrayList对象来完成该接口的实例化
        List list = new ArrayList();
    List接口中的成员方法：
        public boolean add(E e);    //将数据添加到集合的末尾，这里的E是泛型的意思，目前可以先理解为Object类型
        public E get(int index);    //根据索引，索取其对应的元素
        public int size();      //获取集合的长度
    使用集合的步骤
        1.创建集合对象
        2.创建元素对象
        3.将元素对象添加到集合对象中
        4.遍历集合
 */
public class Test {
    public static void main(String[] args) {
        //需求：在List集合中添加3个学生对象，然后遍历；

        //1.创建集合对象
        List list = new ArrayList();

        //2.创建元素对象
        Student s1 = new Student("乔峰",41);
        Student s2 = new Student("乔峰",41);
        Student s3 = new Student("虚竹",38);
        Student s4 = new Student("段誉",26);

        //3.将元素对象添加到集合对象中
        /*boolean b1 = list.add(s1);
        System.out.println(b1);
        boolean b2 = list.add(s2);
        System.out.println(b2);*/
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //直接打印集合
        System.out.println(list);
        //获取索引为2的元素
        Object obj = list.get(2);
        System.out.println("索引为2的元素是：" + obj);
        //获取集合中的元素个数
        System.out.println("集合的长度是：" + list.size());

        //4.遍历集合
        for (int i = 0; i < list.size() ; i++) {
            //i表示的就是集合中每个元素的索引
            //获取元素
            Object obj2 = list.get(i);
            System.out.println("索引为： " + i + "的元素是" + obj2);
        }
    }
}
