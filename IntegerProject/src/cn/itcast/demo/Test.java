package cn.itcast.demo;

/*
    除了Character类以外，其他的七种包装类都有parseXXX（）方法
    因为如果字符串想转换成char类型的数据，可以通过String类中的方法toCharArray(),charAt();
 */
public class Test {
    public static void main(String[] args) {
        //因为变量a属于基本类型，不能通过对象名.的形式调用方法
        //解决方案：将其转换成对应的包装类（引用类型）即可
        int a = 10;

        //装箱
        Integer i1 = new Integer(a);
        //拆箱
        int b = i1.intValue();
        System.out.println(i1);
        System.out.println(b);

        //JDK5的新特性，自动拆装箱
        Integer i2 = 30;        //装箱
        int c = i2;        //拆箱
        System.out.println("---------------------");

        //需求：将字符串类型的"10",转换成int类型的10
        String s = "10";
        int num = Integer.parseInt(s);
        System.out.println("num: " + num);
        System.out.println("num+100: " + (num + 100));
    }
}
