package cn.dashz.回文数;

import java.util.Scanner;

/**
 * 判断一个整数是否是回文数。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext("exit")){
            int num = scanner.nextInt();
            boolean result = solution.isPalindrome(num);
            System.out.println(result);
        }
    }
}
