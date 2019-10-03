package cn.dashz.有效的括号;

import java.util.Scanner;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 */
public class SolutionTest {
    public static void main(String[] args) {
        //定义一个Scanner对象
        Scanner scanner = new Scanner(System.in);
        //创建一个Solution对象
        Solution solution = new Solution();

        //以exit作为输入终止标志
        while (!scanner.hasNext("exit")){
            //接收输入的字符串
            String str = scanner.nextLine();
            //接收返回的结果
            boolean result = solution.isValid(str);
            //将结果打印出来
            System.out.println(result);
        }
    }
}
