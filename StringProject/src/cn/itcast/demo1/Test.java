package cn.itcast.demo1;

public class Test {
    public static void main(String[] args) {
        //测试 构造方法
        //1.将指定的字节数组转成字符串
        //'a':97
        byte[] bys = {97, 98, 99};
        String str1 = new String(bys);
        System.out.println("str1: " + str1);

        //2.将指定的字符数组转成字符串
        char[] chs = {'h','e','l','l','o'};
        String str2 = new String(chs);
        System.out.println(str2);

        //在实际开发过程中，String类非常常用，每次new都很麻烦，于是针对于String的语法做了优化，省去了new的动作
        String str3 = "abc";    //免new
//        String str4 = new String("abc");
        System.out.println("------------------------------");

        //测试成员方法
        String s1 = "abc";
        String s2 = "ABC";

        boolean b1 = s1.equals(s2);
        System.out.println("equals(): " + b1);

        boolean b2 = s1.equalsIgnoreCase(s2);
        System.out.println("equalsIgoreCase(): " + b2);

        boolean b3 = s1.startsWith("ab");
        System.out.println("startsWith(): " + b3);

        String s3 = "hello";
        boolean b4 = s3.isEmpty();
        System.out.println("isEmpty(): " + b4);

    }
}
