package com.problems.dynamicprogramming.easy;

import java.util.ArrayList;
import java.util.List;

public class MinCostClimbingStairs {
    public static void main(String[] args){
        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));
    }
    public static int minCostClimbingStairs(int[] cost) {

        for(int i=2; i<cost.length; i++){
            cost[i] += Math.min(cost[i-1],cost[i-2]);
        }

        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
}