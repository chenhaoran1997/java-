package cn.itcast.demo2;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file1 = new File("lib/1.txt");

        //获取file1的绝对路径
        String path1 = file1.getAbsolutePath();
        System.out.println("绝对路径：" + path1);

        //获取file1的相对路径
        String path2 = file1.getPath();
        System.out.println("相对路径：" + path2);

        //获取文件名
        String fileName = file1.getName();
        System.out.println("文件名：" + fileName);
        System.out.println("----------------------------");
        //获取lin文件夹下所有文件(夹)的：名称数组String[]

        File file2 = new File("lib");
        String[] names = file2.list();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("----------------------------");

        //获取lib文件夹下所有的文件(夹)的：File对象数组File[]
        File files[] = file2.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
