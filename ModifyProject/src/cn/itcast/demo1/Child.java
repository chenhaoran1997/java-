package cn.itcast.demo1;

public class Child extends Father{
    public static void main(String[] args) {
        Father f = new Father();
        //f.show1();
        f.show2();
        f.show3();
        f.show4();

        System.out.println("----------------");

        Child c = new Child();
        c.show2();
        c.show3();
        c.show4();
    }
}
