package com.problems.hashtable.easy;

import java.util.*;

public class ContainsDuplicate2 {
    public static void main(String[] args){
        System.out.println(containsNearbyDuplicate(new int[]{0,1,2,3,4,0,0,7,8,9,10,11,12,0},1));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,List> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                List<Integer> list = map.get(nums[i]);
                if(i - list.get(list.size()-1) <=k){
                    return true;
                }
                list.add(i);
                map.put(nums[i],list);
            }else {
                List<Integer> list = new ArrayList();
                list.add(i);
                map.put(nums[i],list);
            }
        }
//        for(int j: map.keySet()){
//            if(map.get(j).size()>1){
//                List<Integer> tempArr = map.get(j);
//                int a = 0;
//                int b = 1;
//                while(b<tempArr.size()) {
//                    if (Math.abs(tempArr.get(a) - tempArr.get(b)) <= k) {
//                        return true;
//                    }
//                    a++;
//                    b++;
//                }
//            }
//        }
        return false;
    }
}
