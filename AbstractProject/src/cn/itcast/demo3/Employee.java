package cn.itcast.demo3;

//父类 员工类
public abstract class Employee {
    //成员变量
    //姓名
    private String name;
    //工资
    private double salary;
    //工号
    private String id;

    //构造方法
    public Employee() {
    }

    public Employee(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    //getXxx() setXxx()
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //成员方法
    //工作
    public abstract void work();
}
