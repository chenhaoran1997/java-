package cn.dashz.两数之和;


public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        //对数组进行遍历，找到两数之和为目标值的数，并将其返回
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1;j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
