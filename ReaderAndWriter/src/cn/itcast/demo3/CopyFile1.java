package cn.itcast.demo3;

import java.io.*;

public class CopyFile1 {
    public static void main(String[] args) throws IOException {
        //需求：通过字符流拷贝文件，一次读写一个字符
        //例如：将1.txt文件中的内容复制到2.txt文件中
        /*
            IO流拷贝文件核心六步
                1.创建字符输入流对象，关联数据源文件
                2.创建字符输出流对象，关联目的地文件
                3.定义变量，记录读取到的内容
                4.循环读取，只要条件满足就一直读，并将读取到的内容赋值给变量
                5.将读取到的数据写入到目的地文件中
                6.释放资源
         */
        //1.
        //Reader reader = new FileReader("lib/1.txt");
        FileReader fr = new FileReader("lib/1.txt");
        //2
        FileWriter fw = new FileWriter("lib/3.txt"); //细节：如果目的地文件不存在，程序会自动创建
        //3
        int len;
        //4
        while ((len = fr.read()) != -1){
            //5
            fw.write(len);
        }
        //6
        fr.close();
        fw.close();
    }
}
