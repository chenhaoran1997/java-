package cn.itcast.demo2;

public class Test {
    public static void main(String[] args) {
        //用来测试Dog类与Mouse类
        //测试Dog类
        Dog d = new Dog();
        d.setName("哈士奇");
        showAnimal(d);

        //测试老鼠类
        Mouse m = new Mouse();
        m.setName("jerry");
        showAnimal(m);

    }
    //多态的使用场景：父类型可以作为形参的数据类型
    public static void showAnimal(Animal an){
        an.eat();
    }

    //定义showAnimal()方法
    /*public static void showAnimal(Dog d){
        d.eat();
    }

    public static void showAnimal(Mouse m){
        m.eat();
    }*/
}
