package cn.dashz.整数反转;

/**
 * 算法：
 * 将数字num的最后一位数字弹出，推到结果的后面
 * //pop operation:
 * pop = x % 10;
 * x /= 10;
 *
 * //push operation:
 * temp = rev * 10 + pop;
 *
 * 判断是否溢出
 * 假设该数字为正，数字为负时类似
 * 如果temp = rev * 10 + pop会溢出，那么一定会有rev >= MAX_VALUE
 * 如果rev > MAX_VALUE/10 结果一定溢出
 * 如果rev = MAX_VALUE/10 弹出的数字大于7则会溢出
 */
public class Solution {
    public int reverse(int num){
        //定义一个int变量返回结果
        int rev = 0;
        //如果接收的数字不为零
        while (num !=0){
            //将数字的最后一位弹出
            int pop = num % 10;
            num /= 10;

            //数字为正时的溢出条件
            if (rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && pop > 7)
                return 0;

            //数字为负时的溢出条件
            if (rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && pop < -8)
                return 0;

            //将弹出的数字加入结果中
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
