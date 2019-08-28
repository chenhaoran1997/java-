package cn.itcast.demo2;

import java.io.*;

/*
        字节缓冲流有自己的缓冲区，大小为8192个字节，也就是8KB
        拷贝纯文本文件使用字符流，拷贝其它（图片，音频，视频等）使用字节流
 */
public class CopyFile1 {
    public static void main(String[] args) throws IOException {
        //需求：通过字节缓冲流，将a.png复制到d.png中
        //1.创建字节输入流对象，关联数据源文件
        //创建普通的字节输入流
        //FileInputStream fis = new FileInputStream("lib/a.png");
        //创建高效的字节输入流
        //BufferedInputStream bis = new BufferedInputStream(fis);
        //合并版
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("lib/1.txt"));

        //2.创建字节输出流对象，关联目的地文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/2.txt"));

        //3.定义变量，用来记录读取到的内容
        int len;

        //4.循环读取，只要条件满足就一直读，然后将读取到的内容赋值给变量
        while ((len = bis.read()) != -1){
            //5.将读取到的内容写入到目的地文件中
            bos.write(len);
        }

        //6.释放资源
        bis.close();
        bos.close();
    }
}
