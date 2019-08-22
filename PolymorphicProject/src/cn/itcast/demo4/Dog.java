package cn.itcast.demo4;

//子类 Dog类
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    //狗类独有的方法，父类中没有的成员方法
    public void watch(){
        System.out.println("狗会看家");
    }
}
