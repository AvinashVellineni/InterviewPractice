package com.problems.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args){
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
    public static boolean containsDuplicate(int[] nums) {
        Map map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else {
                return true;
            }
        }
        return false;
    }
}
