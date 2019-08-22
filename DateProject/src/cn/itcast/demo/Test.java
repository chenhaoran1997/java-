package cn.itcast.demo;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //测试Date类
        //测试空参构造，采用当前系统的默认时间
        Date date1 = new Date();
        System.out.println("date1: " + date1);

        //获取当前操作系统时间的毫秒值
        long time = date1.getTime();
        System.out.println("time: " + time);

        //Thu Aug 22 16:48:16 CST 2019      ---->1566463696708
        //创建一个指定的时间
        Date date2 = new Date(1566463696708L);
        System.out.println("date2: " + date2);


    }
}
