package cn.itcast.demo2;

//子类 Dog类
public class Dog extends Animal{
    @Override
    public void eat() {
        //super.eat();
        System.out.println(getName() + "吃骨头");
    }
}
