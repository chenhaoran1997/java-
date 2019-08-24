package cn.itcast.demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //需求：往Map集合中添加三个学生对象，然后打印；
        //1.创建集合对象
        //键：学生的编号，值：具体的学生对象
        Map<Integer,Student> map = new HashMap<>();
        //2.创建元素对象
        Student s1 = new Student("张三" ,23);
        Student s2 = new Student("李四" ,24);
        Student s3 = new Student("张三" ,23);

        //3.将元素对象添加到集合中
        /*Student stu1 = map.put(1,s1);
        System.out.println("stu1 :" + stu1);
        Student stu2 = map.put(1,s2);
        System.out.println("stu2 :" + stu2);*/

        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);

        //根据键，获取值
        Student stu3 = map.get(2);
        System.out.println("key: " + 2 + "value: " + stu3);

        //打印集合
        System.out.println(map);

        //4.遍历集合
        /*
            遍历步骤：
                1.获取所有键的集合。                   keySet()
                2.遍历所有的键，获取到每一个键。       迭代器，增强for.
                3.根据键，获取指定的值                 get();
         */
        /*Set<Integer> keys = map.keySet();
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            //如果迭代器当中有数据，就获取
            Integer key = it.next();
            //根据键获取值
            Student value = map.get(key);
            System.out.println("key: " + key + "....value: " + value);
        }*/

        //通过增强for实现
        //获取到所有的键
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            //key就是双列集合中的每一个键
            Student value = map.get(key);
            System.out.println("key: " + key + "....value: " + value);
        }
    }
}
