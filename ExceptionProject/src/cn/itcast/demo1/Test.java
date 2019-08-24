package cn.itcast.demo1;

/*
    Java中的异常
        分类：
            顶层父类：Throwable
                子类：Error（错误，不需要我们处理）
                子类：Exception（异常，这个才是我们常说的异常）
        JVM默认的异常处理方式：
            在控制台中打印异常信息，并终止程序
        处理方式：
            方式一：捕获，自己处理。try..catch..finallly
                格式：
                try{
                    //尝试执行的代码（有可能出现问题的代码）
                }catch（Exception e）{
                    //出现问题后的解决方案
                }finally{
                    //写在这里的代码正常情况下一定会执行，一般是用来释放资源的
                }
            方式二：抛出，交给调用者处理，throws
 */
public class Test {
    public static void main(String[] args) {
        //通过try,catch,fianlly来处理异常
        try{
            //尝试要执行的代码
            int a = 10/0;
        }catch(Exception e){
            //出现问题后的代码（解决方案）
            System.out.println("被除数不能为零");
            //return;
        }finally {  //即使try或者catch中有return，finally里边的代码也会执行
            System.out.println("看看我执行了吗");
        }
        //System.out.println("看看我执行了吗");
    }
}
