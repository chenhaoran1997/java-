package cn.itcast.demo3;

//子类 Coder类
public class Coder extends Employee{
    //小细节：在实际开发过程中 子类一般都有两个构造方法
    //子类的空参构造访问父类的空参构造
    //子类的全参构造访问父类的全参构造
    public Coder() {
    }

    public Coder(String name, double salary, String id) {
        super(name, salary, id);
    }

    @Override
    public void work() {
        System.out.println("程序员要敲代码");
    }
}
