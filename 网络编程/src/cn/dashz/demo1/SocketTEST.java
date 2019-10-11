package cn.dashz.demo1;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SocketTEST {
    public static void main(String[] args)  {
        try {
            URL url = new URL("http://www.baidu.com");
            InputStream inputStream = url.openStream();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(inputStream)
            );
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
