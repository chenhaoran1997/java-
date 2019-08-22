package cn.itcast.demo1;

public class Test {
    public static void main(String[] args) {
        //非静态方法的调用方式：通过对象名.的形式调用
        //1.创建Object类型的对象
        Object obj1 = new Object();
        Object obj2 = new Object();

        //2.测试Object类中的成员方法
        // int hashCode();      返回对象的哈希码值   不同对象的哈希码值一般不同
        int code1 = obj1.hashCode();
        int code2 = obj2.hashCode();
        System.out.println(code1);
        System.out.println(code2);
        System.out.println("--------------------------");

        //Class<?> getClass(): 返回调用者的字节码文件对象    一个类只有一个字节码文件对象
        Class clazz1 = obj1.getClass();
        Class clazz2 = obj2.getClass();
        System.out.println(clazz1);
        System.out.println(clazz2);
        System.out.println("--------------------------");

        //String toString();    返回该对象的字符串表示形式   默认打印的是地址值，但是不同对象的地址值肯定不同
        //                      地址的组成：全类名 + @ + 该对象的哈希码的无符号十六进制形式
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("--------------------------");

        //boolean equals();     比较两个对象是否相等,默认比较的是地址值，无意义，子类一般都会重写这个方法
        boolean b1 = obj1.equals(obj2);
        System.out.println(b1);
    }
}

