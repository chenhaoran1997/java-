public class ContinueDemo {
    public static void main(String[] args) {
        for (int i =0;i<100;i++){
            if(i%10==7||i/10==7||i%7==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
