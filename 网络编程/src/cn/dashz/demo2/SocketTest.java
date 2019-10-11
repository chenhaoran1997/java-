package cn.dashz.demo2;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest {
    public static void main(String[] args) {
        //创建字符缓冲流读对象
        BufferedReader br = null;
        //创建字符缓冲流写对象
        BufferedWriter bw = null;
        String url = "www.baidu.com";
        try {
            //创建Socket套接字
            Socket socket = new Socket(url,80);
            //获取socket字节输出流对象
            OutputStream outputStream = socket.getOutputStream();
            OutputStreamWriter osWriter = new OutputStreamWriter(outputStream);
            bw = new BufferedWriter(osWriter);

            bw.write("GET /" + url + " HTTP/1.1\r\n" );
            bw.write("HOST:" + url + "\r\n");
            bw.write("\r\n");
            bw.flush();
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bw != null){
                try {
                    bw.close();
                }  catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
