package com.problems.twopointer.easy;

import java.util.Arrays;

public class TwoSumLessThanK {
    public static void main(String[] args){
//        System.out.println(twoSum(new int[]{34,23,1,24,75,33,54,8},60));
        System.out.println(twoSum(new int[]{10,20,30},15));
    }
    public static int twoSum(int[] A,int K){
        int max = -1;
        Arrays.sort(A);
        int i = 0;
        int j=A.length -1;
        while (i<j){
            if(A[i]+A[j] >= K){
                j--;
            }else {
                max = Math.max(max,A[i]+A[j]);
                i++;
            }
        }
        return max;
    }
}
