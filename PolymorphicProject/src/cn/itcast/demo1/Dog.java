package cn.itcast.demo1;

//Animal类的子类
public class Dog extends Animal{
    //因为狗吃骨头，所以要优化父类的eat()方法
    @Override
    public void eat() {
        //super.eat();
        System.out.println(getName() + "吃骨头");
    }
}
