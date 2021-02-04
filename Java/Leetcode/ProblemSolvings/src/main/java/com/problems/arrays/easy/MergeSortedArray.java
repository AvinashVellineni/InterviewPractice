package com.problems.arrays.easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args){
        merge(new int[]{1,2,3,0,0,0},3,new int[]{1,2,6},3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int index = nums1.length-1;
        while(index>=0){
            if(m<0){
                nums1[index]=nums2[n];
                n--;
            }else if(n<0){
                nums1[index] = nums1[m];
                m--;
            }else {
                if(nums2[n] > nums1[m]){
                    nums1[index] = nums2[n];
                    n--;
                }else {
                    nums1[index] = nums1[m];
                    m--;
                }
            }
            index--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
