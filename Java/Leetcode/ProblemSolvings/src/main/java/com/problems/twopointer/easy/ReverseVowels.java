package com.problems.twopointer.easy;

import java.util.Arrays;

public class ReverseVowels {
    public static void main(String[] args){
        System.out.println(reverseVowels("leetcode"));
    }
    public static String reverseVowels(String s) {

        String[] input = s.split("");
        int start = 0; int end = s.length()-1;
        boolean foundLeft = false;
        boolean foundRight = false;
        while (start<end){
            if(input[start].toLowerCase().equals("a") || input[start].toLowerCase().equals("e") || input[start].toLowerCase().equals("i") || input[start].toLowerCase().equals("o") || input[start].toLowerCase().equals("u")){
                foundLeft=true;
            }
            if(input[end].toLowerCase().equals("a") || input[end].toLowerCase().equals("e") || input[end].toLowerCase().equals("i") || input[end].toLowerCase().equals("o") || input[end].toLowerCase().equals("u")){
                foundRight=true;
            }
            if(foundLeft && foundRight){
                String temp = input[start];
                input[start] = input[end];
                input[end] = temp;
                start++;
                end--;
                foundLeft = false;
                foundRight = false;
            }else if(foundRight){
                start++;
            }else if(foundLeft){
                end--;
            }else {
                start++;
                end--;
            }
        }
        return String.join("",input);
    }
}
