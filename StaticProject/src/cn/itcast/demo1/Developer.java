package cn.itcast.demo1;

//开发者类
public class Developer {
    //成员变量
    //姓名
    String name;
    //工作内容
    String work;
    //部门名(公共的静态常量)
    public final static String DEPARTMENT_NAME = "研发部";      //应该用static修饰

    //成员方法
    //自我介绍
    public void selfIntroduction(){
        System.out.println("我是" + DEPARTMENT_NAME + "的" + name + "，我的工作内容是" + work);
    }
}
