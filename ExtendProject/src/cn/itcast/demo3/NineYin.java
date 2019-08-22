package cn.itcast.demo3;
/*
    子类 九阴真经
 */
public class NineYin extends Martial{
    //练习内功
    public void internalStrength(){
        //调用父类的成员方法
        super.internalStrength();
        System.out.println("以柔克刚");
    }

    //练习招式
    public void stroke(){
        System.out.println("九阴白骨爪");
    }
}
