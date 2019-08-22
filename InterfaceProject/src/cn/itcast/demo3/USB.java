package cn.itcast.demo3;

public interface USB {
    //成员常量
    public static final int NUM = 10;

    //成语方法
    //JDK7及其以前的写法
    public abstract void open();
    public abstract void close();

    //JDK8多了两种写法
    public static void method1(){
        System.out.println("我是JDK8的新特性");
    }

    public default void method2(){
        System.out.println("我是JDK8的新特性");
    }

    //JDK9多了一种写法
    private void method3(){
        System.out.println("我是JDK9的新特性");
    }

    //构造方法(接口中没有构造方法)
}
