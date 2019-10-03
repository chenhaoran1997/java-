package cn.dashz.两数之和;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class SolutionTest {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        //定义一个空数组
        int[] nums = {};
        //初始化目标值
        int target = 0;
        //以0为输入终止标志符
        while (!scanner.hasNext("0")){
            //读取数组的大小
            int n = scanner.nextInt();
            //定义数组的大小
            nums = new int[n];
            //接收数组中的数据
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            //接收目标值
            target = scanner.nextInt();
        }
        //定义一个int数组接收两数之和的计算结果
        int result[];
        result = Solution.twoSum(nums,target);

        //通过Arrays的toString方法输出数组
        System.out.println(Arrays.toString(result));
    }
}
