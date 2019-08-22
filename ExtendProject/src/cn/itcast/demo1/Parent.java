package cn.itcast.demo1;

//创建一个Parent类
public class Parent {
    //成员变量
    private String name;
    private int age;

    //构造方法
    public Parent() {
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //快捷键alt+insert 快速生成构造方法和公共访问方式
    //公共访问方式
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
