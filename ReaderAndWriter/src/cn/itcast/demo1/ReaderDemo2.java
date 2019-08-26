package cn.itcast.demo1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo2 {
    public static void main(String[] args) throws IOException {
        //需求：通过字符流读取数据，一次读取一个字符数组
        //1.创建字符输入流对象
        Reader reader = new FileReader("lib/2.txt");
        //2.读取数据
        /*char[] chs = new char[3];
        int len1 = reader.read(chs);
        System.out.println(chs);        //a,b,c
        System.out.println(len1);       //3

        int len2 = reader.read(chs);
        System.out.println(chs);        //d,e,f
        System.out.println(len2);       //3

        int len3 = reader.read(chs);
        System.out.println(chs);        //g,e,f
        System.out.println(len3);       //1

        int len4 = reader.read(chs);
        System.out.println(chs);        //g,e,f
        System.out.println(len4);       //-1*/

        /*
            优化上述代码，while循环
         */
        //定义字符数组
        char[] chs = new char[3];
        //定义一个变量，记录读取到的有效字符数。
        int len;
        while ((len = reader.read(chs)) != -1){
            //将读取到的内容，转换成字符串，然后打印
            /*
                chs:表示要操作的数组
                0：表示起始索引
                len：表示要操作的字符的个数
             */
            String s = new String(chs,0,len);   //[g,e,f],0,1
            System.out.println(s);
        }

        //3.释放资源
        reader.close();
    }
}
