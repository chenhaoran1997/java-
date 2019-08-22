package cn.itcast.demo;

public class Test {
    public static void main(String[] args) {
        //测试构造方法
        //测试空参构造
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb.append("abc");
        System.out.println("sb: " + sb);
        System.out.println("sb2: " + sb2);
        System.out.println("---------------------------");

        //将String类型的"abc"转成StringBuilder类型的对象
        StringBuilder sb3 = new StringBuilder("abc");
        System.out.println("sb3: " + sb3);
        System.out.println("---------------------------");

        //测试成员方法
        //需求：将三个字符串拼接成一个新的字符串   学java 到北京 找zone
        StringBuilder sb4 = new StringBuilder();
        sb4.append("学java,");
        sb4.append("到北京");
        sb4.append("找zone");
        System.out.println("sb4: " + sb4);
        System.out.println("---------------------------");
        String s = sb4.toString();
        System.out.println("字符串s: " + s);

    }
}
