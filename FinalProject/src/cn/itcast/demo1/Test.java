package cn.itcast.demo1;

/*
    final关键字:
        final这个单词是"最终"的意思，在Java中是一个关键字，可以用来修饰类，成员变量，成员方法
        修饰的类：不能被继承 但是可以继承其他的类
        修饰的方法：不能被重写
        修饰的变量： 是一个变量，值只能设置一次

 */
public class Test {
    public static void main(String[] args) {
        Employee em = new Coder();
        em.show();
        System.out.println("-----------------");

        //fianl修饰的变量：基本类型变量，是值不能改变
        final int NUM = 20;
        //NUM = 30; 代码报错，常量值只能设置一次
        System.out.println(NUM);
        //fianl修饰的变量：引用类型变量，是地址值不能改变，但是属性值可以发生变化
        final Employee em2 = new Employee();
//        em2 = new Employee(); 代码报错，原因只要new就会开辟新空间，
        em2.name = "张无忌";
        em2.age = 53;
        System.out.println("name属性值：" + em2.name);
        System.out.println("name属性值：" + em2.age);


    }
}
