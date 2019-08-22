package cn.itcast.demo2;

/*
    抽象类中的成员比普通类多一种：抽象方法
    其他和普通类一样
 */
public class Test {
    public static void main(String[] args) {
        //抽象类不能new（抽象类不能实例化）
        //Animal an new Animal(),这样写是错误的

        //初始化抽象类
        Animal an = new Cat();
        System.out.println("-------------");

        //抽象类的成员特点
        an.name = "汤姆";
        System.out.println(an.name);

        //an.age=50; 常量的值不能发生变化
        System.out.println(an.age);
    }
}
