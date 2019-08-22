package cn.itcast.demo1;

//测试类
public class Test {
    public static void main(String[] args) {
        //创建Child类的一个对象
        Child ch = new Child();

        //为对象ch赋值一个名字：张三
        ch.setName("张三");

        //输出对象ch的名字
        System.out.println(ch.getName());

        /*
        Java中子类可以继承父类的非私有成员（成员变量和成员方法）
         */
    }
}
