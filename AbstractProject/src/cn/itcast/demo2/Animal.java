package cn.itcast.demo2;

//父类 动物类
public abstract class Animal {
    //构造方法
    public Animal(){

    }

    public Animal(String name){
        this.name = name;
    }

    //成员变量 其值可以变化
    String name = "哈士奇";
    //成员常量 其值不能发生变化
    final int age =30;

    //吃
    public abstract void eat();

    //睡
    public abstract void sleep();

    public void call() {
        System.out.println("动物会叫");
    }
}
