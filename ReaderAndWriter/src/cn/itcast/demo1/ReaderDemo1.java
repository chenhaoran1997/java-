package cn.itcast.demo1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //通过字符流读取数据
        //1.创建字符输入流
        Reader reader = new FileReader("lib/1.txt");
        //2.读取数据
        /*int ch1 = reader.read();
        System.out.println(ch1);        //97
        int ch2 = reader.read();
        System.out.println(ch2);        //98
        int ch3 = reader.read();
        System.out.println(ch3);        //99
        int ch4 = reader.read();
        System.out.println(ch4);        //-1*/

        /*
            优化上述的读法，用循环改进
            又因为不知道循环次数，所以用while循环
         */
        //定义变量，用来接受读取到的字符
        int ch;
        while ((ch = reader.read()) != -1){
            System.out.println(ch);
        }

        //3.释放资源
        reader.close();
    }
}
