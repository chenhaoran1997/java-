public class BreakAndContinueDemo {
    public static void main(String[] args) {
        label_class:for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println("正在查找" + i + "班的第" + j + "个同学");
                if (i == 2 && j == 5){
                    System.out.println("hhhhhh,找到啦");
                    break label_class;
                }
            }
            System.out.println();
        }
    }
}
