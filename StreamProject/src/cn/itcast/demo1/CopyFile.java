package cn.itcast.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        //需求：通过普通的字节流，一次读写一个字节的方式，将a.png复制到b.png中
        //1.创建字节输入流，关联数据源文件
        FileInputStream fis = new FileInputStream("lib/a.png");

        //2.创建字节输出流，关联目的地文件
        FileOutputStream fos = new FileOutputStream("lib/b.png");

        //3.定义变量，用来记录读取到的内容
        int len;

        //4.循环读取，只要条件满足就一直读，并将读取到的内容赋值给变量
        while ((len = fis.read()) != -1){
            //5.将读取到的内容写入到目的地文件当中
            fos.write(len);
        }

        //6.释放资源
        fis.close();
        fos.close();
    }
}
