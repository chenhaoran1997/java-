package cn.itcast.demo3;

public class Test {
    public static void main(String[] args) {
        //测试程序员类
        Employee em = new Coder();
        em.work();

        //测试经理类
        Employee em2 = new Manager();
        em2.work();
        System.out.println("-------------");

        //快速实例化对象
        /*Coder c = new Coder();
        c.setName("张三");
        c.setSalary(30000);
        c.setId("研发部007");*/

        Coder c = new Coder("张三",30000,"研发部07");
        System.out.println("姓名：" + c.getName());
        System.out.println("工资：" + c.getSalary());
        System.out.println("工号：" + c.getId());

        System.out.println("---------------------------------");

        Manager m = new Manager("李四",40000,"研发部01",100000);
        System.out.println("姓名：" + m.getName());
        System.out.println("工资：" + m.getSalary());
        System.out.println("工号：" + m.getId());
        System.out.println("奖金：" + m.getBonus());
    }
}
