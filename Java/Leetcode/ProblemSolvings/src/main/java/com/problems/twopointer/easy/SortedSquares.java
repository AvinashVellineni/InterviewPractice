package com.problems.twopointer.easy;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args){
        Arrays.stream(sortedSquares(new int[]{-4,-1,0,3,10})).forEach(element -> System.out.println(element));
    }
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int i=0;
        int j=nums.length-1;
        for(int k=nums.length-1;k>=0;k--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                result[k]= nums[i] * nums[i];
                i++;
            }else {
                result[k]= nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }
}


