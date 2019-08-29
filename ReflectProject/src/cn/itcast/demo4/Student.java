package cn.itcast.demo4;

//标准的JavaBean类，学生类
public class Student {
    //成员变量
    private String name;

    //空参构造
    public Student(){
    }

    //带参构造
    public Student(String name) {
        this.name = name;
    }

    //getXxx()和setXxx()
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString()方法，用来打印对象的各个属性值的
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
