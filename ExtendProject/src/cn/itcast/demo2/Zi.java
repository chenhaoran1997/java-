package cn.itcast.demo2;

//子类
public class Zi extends Fu{
    int num = 20;

    public void show(){
        int num = 10;

        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
