package com.problems.arrays.medium;

public class MaxContainerArea {
    public static void main(String[] args){
        int[] arrayHeights = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arrayHeights));
    }

    public static int maxArea(int[] height) {
        int maximumArea = 0,start = 0;
        int end = height.length -1;
        while(start < end){
            maximumArea = Math.max(maximumArea,(Math.min(height[start],height[end])) * (end-start) );
            if(height[start]<height[end]){
                start++;
            }else {
                end--;
            }
        }
        return maximumArea;
    }
}
