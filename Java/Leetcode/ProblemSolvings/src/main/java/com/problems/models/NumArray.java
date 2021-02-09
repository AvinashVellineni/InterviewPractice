package com.problems.models;

public class NumArray {
    private int[] data;
    public NumArray(int[] nums){
        this.data = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i==0){
                this.data[i] = nums[i];
            }else {
                this.data[i]= this.data[i-1] + nums[i];
            }
        }
    }
    public  int sumRange(int i, int j){
        if( i== 0){
            return this.data[j];
        }
        return this.data[j] - this.data[i-1];
    }
}
