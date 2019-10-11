package cn.dashz.计算方程;

public class Solution {
    public double Function_Origin(double x){
        double y;
        y = Math.pow(x,6) - 6 * Math.pow(x,4) + Math.pow(x,3) + 12 * x + Math.pow(3,0.5);
        return y;
    }

    public double Function_Derivate(double x){
        double y;
        y = 6 * Math.pow(x,5) - 24 * Math.pow(x,3) + 3 * Math.pow(x,2) + 12;
        return y;
    }

    public double Result(){
        double x0 ;
        double x1 = 1;
        int i = 1;
        do {
            x0 = x1;
            x1 = x0 - Function_Origin(x0)/Function_Derivate(x0);
            System.out.println("第" + i++ + "次x1的值为" + x1);
        }while (Math.abs(x1 - x0) > 0.00001);
        return x1;
    }
}
