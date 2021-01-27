package com.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum {
    public static void main(String[] args){
        int[] numbers = new int[] {-1,0,1,2,-1,-4};
        System.out.println(threeSum(numbers));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output_array = new LinkedList<>();
        for(int i=0; i<nums.length-2;i++){
            if(i == 0 || (i>0 && nums[i] != nums[i-1])){ // good check proceed without duplicates
                int lower = i+1;
                int higher = nums.length-1;
                int sum = 0 - nums[i];
                while (lower < higher){
                    if(nums[lower] + nums[higher] == sum){
                        output_array.add(Arrays.asList(nums[i],nums[lower],nums[higher]));
                        while (lower<higher && nums[lower] == nums[lower+1]) lower++;
                        while (lower<higher && nums[higher] == nums[higher-1]) higher--;
                        lower++; higher--;
                    }else if (nums[lower] + nums[higher] > sum){
                        higher--;
                    }else {
                        lower++;
                    }
                }
            }
        }
        return  output_array;
    }
}
