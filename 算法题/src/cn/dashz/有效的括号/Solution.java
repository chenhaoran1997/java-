package cn.dashz.有效的括号;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s){
        //定义一个栈用来接收字符数据
        Stack<Character> stack = new Stack<>();

        //将输入的字符串转换成字符数组
        char[] chars = s.toCharArray();

        //遍历字符数组
        for (char aChar : chars) {
            //如果字符栈为空，将字符加入栈中
            if (stack.empty()){
                stack.push(aChar);
            }else if (isTrue(stack.peek(),aChar)){ //如果字符栈顶部字符与字符数组字符相同则弹出
                stack.pop();
            }else { //如果不同则继续加入栈中
                stack.push(aChar);
            }
        }
        //如果栈为空，则说明括号输入有效，不为空则括号输入无效
        return stack.empty();
    }

    //判断两个字符是否匹配
    public boolean isTrue(char c1,char c2){
        return ((c1 == '(' && c2 == ')') ||
                (c1 == '[' && c2 == ']') ||
                (c1 == '{' && c2 == '}') );
    }
}
