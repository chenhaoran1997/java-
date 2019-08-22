package cn.itcast.demo2;

//子类 Mouse类
public class Mouse extends Animal{
    @Override
    public void eat() {
        //super.eat();
        System.out.println(getName() + "吃大米");
    }
}
