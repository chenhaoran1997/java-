package cn.itcast.demo1;

public class Test {
    public static void main(String[] args) {
        //测试Dog类
        Dog dog = new Dog();
        dog.eat();

        //测试Mouse类
        Mouse mouse = new Mouse();
        mouse.eat();
        System.out.println("--------------");

        //通过多态进行测试
        Animal animal = new Dog();
        animal.eat();
    }
}
