package com.problems.dynamicprogramming.easy;

public class BuyAndSellStocks {
    public static void main(String[] args){
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i< prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            max = Math.max(max,prices[i]-min);
        }
        return max;
    }
}


