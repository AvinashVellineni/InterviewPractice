package com.problems.binarySearch.easy;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args){
        System.out.println(Arrays.toString(intersection(new int[] {1,2,2,1},new int[] {2,2})));
    }
    public  static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>  set = new HashSet<>();
        if(nums1.length <nums2.length){
            Set<Integer> list = new HashSet<>();
            for(int i=0; i<=nums1.length-1;i++){
                set.add(nums1[i]);
            }
            for(int j=0;j<=nums2.length-1;j++){
                if(set.contains(nums2[j])){
                    list.add(nums2[j]);
                }
            }
            return list.stream().mapToInt(i->i).toArray();
        }else {
            Set<Integer> list = new HashSet<>();
            for(int i=0; i<=nums2.length-1;i++){
                set.add(nums2[i]);
            }
            for(int j=0;j<=nums1.length-1;j++){
                if(set.contains(nums1[j])){
                    list.add(nums1[j]);
                }
            }
            return list.stream().mapToInt(i->i).toArray();
        }
    }
}
