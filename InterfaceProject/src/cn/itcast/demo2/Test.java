package cn.itcast.demo2;

public class Test {
    public static void main(String[] args) {
        //测试鼠标类
        USB usb = new Mouse();
        usb.open();
        usb.close();
    }
}
