public class TestPhone {
    public static void main(String[] args) {
        Phone p = new Phone();

        p.brand="苹果";
        p.model="X";
        p.name="程序员";

        System.out.println(p.brand);
        System.out.println(p.model);
        System.out.println(p.name);

        System.out.println("--------------");

        p.call("mr.chen");
        p.sendMessage();
        p.playGame();
    }
}
