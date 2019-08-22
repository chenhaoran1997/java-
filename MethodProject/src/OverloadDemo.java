public class OverloadDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean flag1 = compare(a,b);
        System.out.println(flag1);
        System.out.println("-----------------");

        long num1 = 10L;
        long num2 = 20L;
        boolean flag2 = compare(num1,num2);
        System.out.println(flag2);
        System.out.println("-----------------");

        double c=10;
        double d=20;
        boolean flag3=compare(c,d);
        System.out.println(flag3);
        System.out.println("-----------------");
    }

    public static boolean compare(int a,int b){
        System.out.println("比较两个int类型的数据");
        return a==b;
    }
    public static boolean compare(long a,long b){
        System.out.println("比较两个long类型的数据");
        return a==b;
    }
    public static boolean compare(double a,double b){
        System.out.println("比较两个double类型的数据");
        return a==b;
    }
}
