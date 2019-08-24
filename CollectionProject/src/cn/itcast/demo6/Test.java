package cn.itcast.demo6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    单列集合(Collection)之Set集合：
        特点：
            无序（元素的存取顺序不一致），唯一
        结论：
            Set集合保证元素的唯一性依赖:equals(),hashCode()两个方法
 */
public class Test {
    public static void main(String[] args) {
        //需求：往set集合中添加5个对象，然后遍历；
        //1.创建集合对象
        Set<Student> set = new HashSet<>();

        //2.创建元素对象
        Student s1 = new Student("乔峰",41);
        Student s2 = new Student("虚竹",38);
        Student s3 = new Student("段誉",26);
        Student s4 = new Student("乔峰",41);
        Student s5 = new Student("虚竹",38);

        //3.将集合对象添加到元素对象中
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        //4.遍历集合
        /*
            为什么set集合没有"去重"?
                因为Set集合保证元素的唯一性依赖：equals()和hashCode()两个方法
                你没有在Student类中重写这两个方法，默认调用的是Object类中的这两个方法
                而Object类中的equals()方法默认比较的是地址值是否相同

            解决方案：
                在Student类中重写equals()和hashCode()方法
         */
        System.out.println(set);
        System.out.println("-------------------------");

        System.out.println("通过迭代器实现");
        //通过迭代器遍历Set集合
        //A.通过集合对象获取其对应的迭代器对象
        Iterator<Student> it = set.iterator();
        //B.判断迭代器中是否有元素
        while (it.hasNext()){
            //C.如果有，就获取元素
            Student s = it.next();
            System.out.println(s);
        }
        System.out.println("-------------------------");


        //通过增强for遍历Set集合
        System.out.println("通过增强for遍历Set集合");
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
