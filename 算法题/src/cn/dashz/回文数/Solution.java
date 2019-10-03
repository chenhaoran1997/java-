package cn.dashz.回文数;

/**
 * 算法：
 *      所有负数都不可能是回文，
 *      数字整体反转时需要考虑数字是否溢出的问题
 *      只需反转一半的数字与剩余的一半比较即可知道是否为回文数
 *      反转数字时只需将原始数字除以10 给反转后的数字乘以10 当原始数字小于反转后的数字时，则已经处理了一半以上的数字
 *
 *
 */
public class Solution {
    public boolean isPalindrome(int num){
        /*
            数字小于零时不是回文数，
            数字末尾为零需要以零开头才为回文数，满足此条件的数字只有零
         */
        if (num < 0 || num % 10 == 0 && num != 0 ){
            return false;
        }

        //定义计算结果
        int result = 0;

        while (num > result){
            //将原始数字的的最后一位弹出
            int pop = num % 10;
            //计算反转后的数字
            result = result * 10 + pop;
            //将原始数字除以10
            num /= 10;
        }
        //当原始数字为奇数时可以通过除以10的方法去掉它 例如12321
        return (num == result)||(num == result/10);

    }
}
