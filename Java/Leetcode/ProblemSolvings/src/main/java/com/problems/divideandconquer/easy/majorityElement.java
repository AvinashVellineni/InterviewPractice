package com.problems.divideandconquer.easy;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static void main(String[] args){
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        int results = Integer.MIN_VALUE;
        int maxKey = 0;
        for(int keys: map.keySet()){
            if(results < map.get(keys)){
                results = map.get(keys);
                maxKey = keys;
            }
        }
        return maxKey;
    }
}
