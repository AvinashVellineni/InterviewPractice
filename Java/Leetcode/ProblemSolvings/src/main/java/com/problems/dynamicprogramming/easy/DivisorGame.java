package com.problems.dynamicprogramming.easy;

public class DivisorGame {
    private Boolean[] cache = null;
    public static void main(String[] args){
        System.out.println(divisorFunc(10));
    }
    public static boolean divisorFunc(int N){
        return N%2 ==0;
    }
}
