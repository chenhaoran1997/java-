import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r =new Random();
        /*int num = r.nextInt(10);
        System.out.println(num);*/
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }
}
