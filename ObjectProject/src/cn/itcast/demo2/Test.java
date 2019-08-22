package cn.itcast.demo2;

public class Test {
    public static void main(String[] args) {
        //测试toString()方法
        //创建学生类对象
        Student s1 = new Student(1,"欧阳修",66);
        //输出直接打印对象，默认调用了该对象的toString()方法
        System.out.println(s1);
        System.out.println(s1.toString());

        //测试equals()方法
        Student s2 = new Student(2,"欧阳修",66);
        boolean b1 = s1.equals(s2);
        System.out.println(b1);
    }
}
