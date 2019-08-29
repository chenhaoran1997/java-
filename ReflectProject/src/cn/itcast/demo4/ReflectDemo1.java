package cn.itcast.demo4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //需求：通过反射获取类的setter方法，使用该方法为属性赋值
        //1.通过反射获取Student类的字节码文件对象
        Class clazz = Class.forName("cn.itcast.demo4.Student");

        //2.通过反射获取Student类的构造方法，并创建该类的对象
        Constructor con = clazz.getConstructor();
        Student student = (Student)con.newInstance();

        //3.获取到指定的setName()方法，给Student对象设置值
        Method method = clazz.getMethod("setName", String.class);
        method.invoke(student,"张无忌");
        //4.打印学生对象
        System.out.println(student);
    }
}
