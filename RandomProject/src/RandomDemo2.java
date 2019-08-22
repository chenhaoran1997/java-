import java.util.Random;
import java.util.Scanner;

public class RandomDemo2 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100)+1;
        System.out.println("num:" + num);
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的数字");
            int cai = sc.nextInt();
            if (cai == num){
                System.out.println("恭喜你，猜对了");
                break;
            }else if (cai > num) {
                System.out.println("你猜大了");
            }else{
                System.out.println("你猜小了");
            }
        }
    }
}
