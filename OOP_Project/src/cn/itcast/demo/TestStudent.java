package cn.itcast.demo;

public class TestStudent {
    public static void main(String[] args) {
        //无参构造
        Student stu1=new Student();
        stu1.setName("张无忌");
        stu1.setAge(23);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());

        //全参构造
        Student stu2=new Student("韦小宝",40);
        System.out.println(stu2.getName());
        System.out.println(stu1.getAge());
    }
}
