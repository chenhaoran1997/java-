package cn.itcast.demo1;

/**
 *              本类      同包下的类       不同包下的子类         不同包下的无关类
 * private       Y
 * 默认          Y            Y
 * protected     Y            Y                 Y
 * public        Y            Y                 Y                       Y
 *
 * private      给自己使用
 * 默认          给同包下的使用
 * protected     给子类使用
 * public       给大家使用
 */
public class Father {
    private void show1(){
        System.out.println("show1: private");
    }

    void show2(){
        System.out.println("show2: 默认");
    }

    protected void show3(){
        System.out.println("show3: protected");
    }

    public void show4(){
        System.out.println("show4: public");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}
