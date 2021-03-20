package com.problems.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args){
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) +1);
        }
        for(Integer i:map.keySet()){
            if(1 == (int)map.get(i)){
                return i;
            }
        }
        return 0;
    }
}
