package cn.itcast.demo2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) throws IOException {
        //需求：通过字符流，写数据
        //1.创建字符输出流对象
        Writer writer = new FileWriter("lib/1.txt");
        //2.写数据
        //writer.write('好');

        //一次写一个指定的字符数组
        /*char[] chs = {'黑','马','程','序','员'};
        writer.write(chs,2,3);*/

        //一次写一个字符串
        writer.write("好好学习，知识改变命运！");

        //3.释放资源
        writer.close();
    }
}
