import java.util.Scanner;

public class MethodDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1=sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2=sc.nextInt();
        boolean result=compare(num1,num2);
        System.out.println(result);
    }

    public static boolean compare(int a,int b){
        return a==b;
    }
}
