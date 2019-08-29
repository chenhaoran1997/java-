package cn.itcast.demo5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //需求：通过反射获取成员变量并使用
        //1.获取Studen类的字节码文件对象
        Class clazz = Class.forName("cn.itcast.demo5.Student");

        //2.通过字节码文件对象获取构造器对象，然后创建学生类对象
        Constructor constructor = clazz.getConstructor();
        Student student = (Student) constructor.newInstance();

        //3.设置学生对象的各个属性值
        //3.1设置姓名
        Field field1 = clazz.getField("name");
        field1.set(student,"张无忌");

        //3.2设置年龄
        Field field2 = clazz.getDeclaredField("age");
        //开启暴力反射field2.setAccessible(true);
        field2.set(student,30);

        //4.打印学生对象
        System.out.println(student);
    }
}
