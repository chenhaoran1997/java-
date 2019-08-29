package cn.itcast.demo1;

/**
 * 获取Class对象（字节码文件对象）的三种方式
 *      1.Object类的getClass()方法
 *          Class clazz = 对象名.getClass()
 *
 *      2.类的静态属性
 *          Class clazz = 类名.class
 *
 *      3.Class类的静态方法
 *          Class clazz = Class.forName("类的正名")
 *          正名：包名 + 类名
 *
 *     注意：
 *          一个源文件（.java文件）对应一个字节码文件对象（.class）
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //需求：获取Class对象
        //方式一：
        Student stu = new Student();
        Class clazz1 = stu.getClass();

        //方式二：
        Class clazz2 = Student.class;

        //方式三：
        Class clazz3 = Class.forName("cn.itcast.demo1.Student");

        //思考：如何验证三个Class对象是同一个对象？
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);
    }
}
