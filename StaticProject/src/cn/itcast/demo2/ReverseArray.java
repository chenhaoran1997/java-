package cn.itcast.demo2;

public class ReverseArray {
    int num1 = 10;
    static int num2 = 20;

    //静态方法中没有对象this，所以不能访问非静态成员
    public static void show(){
        //System.out.println(num1);
        System.out.println(num2);
    }

    public static void reverse(int[] arr){
        /*
            这里只需要完成交换元素的作用
            假设数组中的元素值为:int[] arr = {11,22,33,44,55};
            明确谁和谁交换
            明确交换次数
         */
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}
