package cn.itcast.demo1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建Scanner类的对象
        //标准的输入流，默认指向键盘
        Scanner sc = new Scanner(System.in);

        //接受整数
        /*System.out.println("请输入一个整数");
        //为了避免InputMismatchException异常，可以加入一个判断
        if(sc.hasNextInt()){//判断下一个录入的是否是一个整数，如果是，结果就是true
            int num = sc.nextInt();
            System.out.println("num:" + num);
        }*/

        //接受字符串类型的数据
        System.out.println("请录入一个字符串");
//        String str1 = sc.nextLine();  //结束标记是：换行符
//        System.out.println("str1: " + str1);

        String str2 = sc.next();    //结束标记是空白标记
        System.out.println("str2: " + str2);





    }
}
