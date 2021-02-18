package com.problems.dynamicprogramming.easy;

public class MinCostClimbingStairsNewImplementation {
    public static void main(String[] args){
        System.out.println(minCost(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }

    public static int minCost(int[] cost){
        int step1 = 0;
        int step2 = cost[cost.length-1];
        for(int i =cost.length-2; i>=0; i--){
            int current_Cost = cost[i] + Math.min(step2,step1);
            step1 = step2;
            step2 = current_Cost;
        }
        return Math.min(step2,step1);
    }
}
