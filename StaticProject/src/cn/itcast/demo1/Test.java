package cn.itcast.demo1;

public class Test {
    public static void main(String[] args) {
        Developer d1 = new Developer();
        d1.name = "小黑";
        d1.work = "写代码";
        //d1.departmentName = "开发部";
        d1.selfIntroduction();

        Developer d2 = new Developer();
        d2.name = "圆圆";
        d2.work = "鼓励师";
        d2.selfIntroduction();
        System.out.println("-----------------------");

       // Developer.departmentName = "开发部";
        d1.selfIntroduction();
        d2.selfIntroduction();

    }
}
