package com.problems.dynamicprogramming.easy;

public class climbingSteps {
    public static void main(String[] args){
        System.out.println(numberOfWays(5));
    }
    public static int numberOfWays(int n){
        int[] resultArray = new int[n+1];
        if(n==0 || n==1){
            return 1;
        }
        resultArray[0] = 1;
        resultArray[1] = 1;
        for(int i=2; i<=n; i++){
            resultArray[i] = resultArray[i-1] + resultArray[i-2];
        }
        return resultArray[n];
    }
}
