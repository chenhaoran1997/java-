package cn.itcast.demo1;

public class Test {
    public static void main(String[] args) {
        //多态
        Smoking sm = new Teacher();
        sm.smoke();
    }
}
