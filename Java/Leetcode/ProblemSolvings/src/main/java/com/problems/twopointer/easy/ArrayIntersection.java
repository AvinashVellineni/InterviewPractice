package com.problems.twopointer.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayIntersection {

    public static void main(String[] args){
        System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1},new int[]{2,2})));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap();
        List<Integer> list = new ArrayList();
        for(int i=0;i<nums1.length;i++){
            int frequency = map.getOrDefault(nums1[i],0);
            map.put(nums1[i],frequency+1);
        }
        for (int j=0;j<nums2.length;j++){
            if(map.get(nums2[j])!= null && map.get(nums2[j])>0){
                list.add(nums2[j]);
                map.put(nums2[j],map.get(nums2[j])-1);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
