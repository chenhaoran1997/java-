package cn.itcast.demo1;

public class Test {
    public static void main(String[] args) {
        //实现多态
        /*
                Java实现多态的步骤
                1.要有继承（或者实现的）关系
                2.要有方法重写
                3.要有父类引用指向子类对象
         */
        //多态
        Animal an = new Dog();

        //成员方法的调用
        /*
            结论：多态中调用成员方法是
            编译看左（左边的类型有没有这个成员）
            运行看右（运行时具体用的是右边类中的成员）
         */
        an.setName("哈士奇");
        an.eat();
    }
}
