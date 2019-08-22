package cn.itcast.demo;
/*
    定义一个标准bean类
 */
public class Student {
    //成员变量用private
    //姓名
    private String name;
    //年龄
    private int age;

    //构造方法，无参构造、全参构造
    public Student(){

    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    //公共的访问方式
    //设置名字
    public void setName(String name){
        this.name=name;
    }

    //获取名字
    public String getName() {
        return name;
    }

    //设置年龄
    public void setAge(int age){
        this.age=age;
    }

    //获取年龄
    public int getAge(){
        return age;
    }
}
