package cn.itcast.demo2;

public class Test {
    public static void main(String[] args) {
        //测试show()方法
        ReverseArray.show();

        System.out.println("------------------");

        int[] arr ={1, 5, 6, 3, 9, 0 };
        ReverseArray.reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("------------------");
    }
}
