package cn.itcast.demo2;

public class Test {
    public static void main(String[] args) {
        //定义一个字符串
        String str = "java 程序员 java";

        //int length()              获取当前字符串的长度
        int length = str.length();
        System.out.println(length);

        //char charAt(int index);   获取指定位置的字符
        char ch = str.charAt(1);
        System.out.println(ch);

        //int indexOf(String);      获取指定字符（串）第一次出现的索引
        //需求 字符a第一次出现的位置
        int index1 = str.indexOf('a');
        System.out.println("index1:" + index1);

        //int lastIndexOf(String);   获取指定字符（串）最后一次出现的索引
        //需求 字符'a'最后一次出现的位置
        int index2 = str.lastIndexOf('a');
        System.out.println("index2:" + index2);

        //String substring(int);    获取指定索引位置（含）之后的字符串
        //需求：截取从索引5开始的所有元素
        String s1 = str.substring(5);
        System.out.println("s1:" + s1);

        //String substring(int,int);    获取指定索引start位置（含）起至索引end位置（不含）的字符串
        //需求：截取从索引5，10的所有元素
        String s2 = str.substring(5,8);
        System.out.println("s2:" + s2);
    }
}
