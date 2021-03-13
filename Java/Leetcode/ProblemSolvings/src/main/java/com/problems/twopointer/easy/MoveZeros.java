package com.problems.twopointer.easy;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args){
        moveZeroes(new int[]{0,1,0,3,12});;
    }
    public static void moveZeroes(int[] nums) {

       if(nums.length <=1){
           return;
       }
       int i =0,j=1;
       while(i<nums.length && j<nums.length){
           if(nums[i]!=0){
               i++;
               j++;
           }else {
               if(nums[i] == 0 && nums[j] ==0){
                   j++;
               }else {
                   int temp = nums[i];
                   nums[i]= nums[j];
                   nums[j]=temp;
                   i++;
                   j++;
               }
           }
       }
        Arrays.stream(nums).forEach(num -> System.out.println(num));
    }
}
