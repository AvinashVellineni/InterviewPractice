package com.problems.dynamicprogramming.easy;

public class isSubsequence {
    public static void main(String[] args){
        System.out.println(isSubsequence("acb","ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        String[] input = s.split("");
        String[] evaluateString = t.split("");
        int j=0;
        if(s.equals("")){
            return true;
        }
        for(int i=0;i<evaluateString.length;i++){
            if(input[j].equals(evaluateString[i])){
                j++;
                if(j==input.length){
                    return true;
                }
            }
        }
        return false;
    }
}
