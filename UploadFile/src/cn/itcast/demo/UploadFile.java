package cn.itcast.demo;

import java.io.*;
import java.util.Scanner;

public class UploadFile {
    public static void main(String[] args) throws IOException {
        //需求：模拟用户上传头像的功能，假设所有的用户头像都应该上传到：项目下的lib文件夹中
        //1.定义一个方法，用来获取要上传的用户头像的路径。getPath()
        File path = getPath();
        System.out.println(path);       //E:\Java\StreamProject\lib\a.png

        //2.定义一个方法，用来判断要上传的用户头像，在lib文件夹中是否存在
        boolean flag = isExists(path.getName());        //a.png

        //3.如果存在，提示：该用户头像已经存在，上传失败
        if (flag){
            System.out.println("该用户头像已经存在，上传失败");
        }else {
            //4.如果不存在，就上传该用户头像，并提示上传成功
            //数据源文件                                 目的地文件
            //E:\Java\StreamProject\lib\a.png    -->     lib\a.png
            uploadFile(path);
        }
    }

    //1.定义一个方法，用来获取要上传的用户头像的路径。getPath()
    /**
     * 用来获取要上传的用户头像的路径
     * @return  具体的要上传的用户头像的路径
     */
    public static File getPath(){
        //1.提示用户录入 要上传的用户头像路径，并接收。
        Scanner sc = new Scanner(System.in);

        //7.因为不知道用户多少次能录入正确，所以用while(true)改进
        while (true){
            System.out.println("请用户录入您要上传的用户头像的路径");
            String path = sc.nextLine();

            //2.判断该路径的后缀名是否是：.jpg   .png    .bmp
            //3.如果不是，就提示：您录入的不是图片，请重新录入
            if (!path.endsWith(".png") && !path.endsWith("jpg") && !path.endsWith("bmp")){
                System.out.println("您录入的不是图片，请重新录入");
                //细节，千万注意，别忘了写
                continue;
            }

            //4.如果是，程序接着执行，判断该路径是否存在，并且是否是文件
            File file = new File(path);
            if (file.exists() && file.isFile()){
                //6.如果是，说明就是我们想要的数据（图片，文件），直接返回
                return file;
            }else {
                //5.如果不是，就提示，您录入的路径不合法，请重新录入
                System.out.println("您录入的路径不合法，请重新录入");
            }
        }
    }

    //2.定义一个方法，用来判断要上传的用户头像，在lib文件夹中是否存在
    public static boolean isExists(String path){    //a.png
        //1.将lib文件夹封装成File对象
        File file = new File("lib");

        //2.获取lib文件夹中所有的文件（夹）的名称数组
        String[] names = file.list();

        //3.遍历第二步获取到的数组，用获取到的数据依次和path进行比较
        for (String name : names) {
            if (name.equals(path)){
                //4.如果一致，说明该用户头像已经存在了，就返回true
                return true;
            }
        }
        //5.如果不一致，说明该用户头像不存在，就返回false
        return false;
    }

    //4.定义方法，用来上传具体的用户头像

    /**
     * 用来上传具体的用户头像
     * @param path  数据源文件的路径
     */
    public static void uploadFile(File path) throws IOException {
        //1.创建字节输入流，关联数据源文件
        //FileInputStream类中的构造方法
        //public FileInputStream(File file)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));   //E:\Java\StreamProject\lib\a.png

        //2.创建字节输出流，关联目的地文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lib/" + path.getName()));    //lib\a.png

        //3.定义变量记录读取到的数据
        int len;

        //4.循环读取，只要条件满足就一直读，并将读取到的数据赋值给变量
        while ((len = bis.read()) != -1){
            //5.将读取到的数据写入到目的地文件中
            bos.write(len);
        }

        //6.释放资源
        bis.close();
        bos.close();

        System.out.println("上传成功");
    }
}
