package com.problems.dynamicprogramming.easy;

import com.problems.models.NumArray;

public class RangeSum {
    public static void main(String[] args){
        NumArray array = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        System.out.println(array.sumRange(0,5));
    }

}
