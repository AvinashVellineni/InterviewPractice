package com.problems.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class summaryRanges {
    public static void main(String[] args){
        System.out.println(summaryRanges(new int[]{-1}));
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length==0){
            return result;
        }
        if(nums.length==1){
            result.add(nums[0]+"");
            return result;
        }
        int start = 0;
        int end = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1){
               end ++;
            }else {
                if(start==end){
                    result.add(nums[start]+"");
                }else {
                    result.add(nums[start]+"->"+nums[end]);
                }
                end++;
                start=end;
            }
        }
        if(start==end){
            result.add(nums[start]+"");
        }else {
            result.add(nums[start]+"->"+nums[end]);
        }
        return result;
    }
}
