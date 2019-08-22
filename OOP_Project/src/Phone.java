public class Phone {
    String brand;
    String model;
    String name;

    public void call(String name){
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }

}
