package com.problems.dynamicprogramming.easy;

public class climbingDynamicArrayOfSteps {
    public static void main(String[] args){
        System.out.println(numberOfWays(5, new int[] {1,3,5}));
    }
    public static int numberOfWays(int n, int[] X){
        int[] result = new int[n+1];
        if(n == 0){
            return  1;
        }
        result[0] = 1;
        for(int i=1 ; i<=n; i++){
            for(int j : X){
                if(i-j>=0){
                    result[i] += result[i-j];
                }else {
                    break;
                }
            }
        }
        return result[n];
    }
}
