package com.problems.arrays.easy;

public class MaximumSubArray {
    public static void main(String[] args){
        int[] input = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(input));

    }
    public static int maxSubArray(int[] nums) {
        int maximumSubarray = nums[0];
        int max = maximumSubarray;
        for(int i=1;i<nums.length; i++){
            maximumSubarray = Math.max(nums[i],maximumSubarray+nums[i]);
            max = Math.max(max,maximumSubarray);
        }
        return max;
    }
}
