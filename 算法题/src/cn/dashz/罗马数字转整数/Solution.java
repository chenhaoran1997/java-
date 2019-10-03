package cn.dashz.罗马数字转整数;

/**
 * 依次遍历字符串，将所有罗马数字相加，之后再判断是否为特殊情况，将加上的减回去
 */
public class Solution {
    public int romanToInt(String string){
        //获取字符串长度
        int length = string.length();
        int num = 0;
        for (int i = 0; i < length; i++) {
            switch (string.charAt(i)){
                case 'I' : num = num + 1; break;
                case 'V' : num = num + 5; break;
                case 'X' : num = num + 10; break;
                case 'L' : num = num + 50; break;
                case 'C' : num = num + 100; break;
                case 'D' : num = num + 500; break;
                case 'M' : num = num + 1000; break;
            }
            if (i != 0){
                if ((string.charAt(i) == 'V' || string.charAt(i) == 'X') && string.charAt(i-1) == 'I'){
                    num = num - 1 * 2;
                }
                if ((string.charAt(i) == 'L' || string.charAt(i) == 'C') && string.charAt(i-1) == 'X'){
                    num = num - 10 * 2;
                }
                if ((string.charAt(i) == 'D' || string.charAt(i) == 'M') && string.charAt(i-1) == 'C'){
                    num = num - 100 * 2;
                }
            }
        }
        return num;
    }
}
