package cn.dashz.罗马数字转整数;

import java.util.Scanner;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext("exit")){
            String string = scanner.nextLine();
            int result = solution.romanToInt(string);
            System.out.println(result);
        }
    }
}
