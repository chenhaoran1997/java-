package cn.dashz.demo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 连接数据库测试
 */
public class Test {
    //加载数据库驱动
    public static final String DBDRIVER = "com.mysql.jdbc.Driver";
    //数据库地址
    public static final String DBURL = "jdbc:mysql://49.234.118.36:3306/laravel";
    //连接数据库的用户名
    public static final String DBUSER = "root";
    //连接数据库的密码
    public static final String DBPASS = "970714";

    public static void main(String[] args) {
        try {
            //加载驱动程序
            Class.forName(DBDRIVER);
            //获取连接对象
            Connection connection = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
            System.out.println("数据库连接成功");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
