import java.util.Scanner;

public class Hailstone {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int length = 1;
        while (1 < num){
            if(num % 2 == 1){
                num = 3 * num + 1;
                System.out.println("length:" + length + "num:" + num);
            }else {
                num /= 2;
                System.out.println("length:" + length + "num:" + num);
            }
            length ++;
        }
        System.out.println(length);
    }
}
