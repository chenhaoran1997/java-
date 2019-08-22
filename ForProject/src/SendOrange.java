public class SendOrange {
    public static void main(String[] args) {
        int count=0;
        A:for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 36; j++) {
                if (j % 5 == 0){
                    continue;
                }
                count++;
                System.out.println("正在给" + i + "班的第" + j + "个同学发橙子");
                if (count == 100){
                    break A;
                }
            }
            System.out.println();
        }
        System.out.println("共发放" + count + "个橙子");
    }
}
