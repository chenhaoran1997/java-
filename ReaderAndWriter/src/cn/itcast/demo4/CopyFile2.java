package cn.itcast.demo4;

import java.io.*;

/*
    注意：字符流只能拷贝纯文本文件
 */
public class CopyFile2 {
    public static void main(String[] args) throws IOException {
        //需求：通过字符缓冲流"一次读写一行"的方式，将1.txt文件中的内容拷贝到2.txt文件中
        //1.创建字符缓冲输入流对象，关联数据源文件
        //分开写
        //FileReader fr = new FileReader("lib/1.txt");
        //BufferedReader br = new BufferedReader(fr);
        //合并版
        BufferedReader br = new BufferedReader(new FileReader("lib/1.txt"));

        //2.创建字符缓冲输出流对象，关联目的地文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/2.txt"));

        //3.定义变量，记录读取到的内容
        String str;

        //4.循环读取，只要条件满足就一直读，并将读取到的内容赋值给变量
        while ((str = br.readLine()) != null){
            //5.将读取到的内容写入到目的地文件中
            bw.write(str);
            //千万别忘记换行
            /*
                public void newLine();          根据当前操作系统给出对应的换行符
                                                windows操作系统：\r\n
                                                mac操作系统：\r
                                                unix操作系统：\n
             */
            bw.newLine();
        }

        //6.释放资源
        br.close();
        bw.close();
    }
}
