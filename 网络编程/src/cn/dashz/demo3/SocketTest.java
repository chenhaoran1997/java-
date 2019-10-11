package cn.dashz.demo3;

import java.io.*;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) {
        String host = "www.baidu.com";
        int port = 80;
        Socket socket = null;
        try {
            //在指定端口打开与目标地址的连接
            socket = new Socket(host,port);
            //对socket设置一个超时时间
            //socket.setSoTimeout(15000);
            //客户端请求输出流
            OutputStream outputStream = socket.getOutputStream();
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(outputStream));
            //向输出流写入信息
            writer.write("GET / HTTP/1.1\n" );
            writer.write("HOST:" + host + "\n" );
            writer.write("Connection: Keep-Alive\n");
            writer.write("\n" );
            writer.flush();

            //客户端获取输入流
            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (socket != null)
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
