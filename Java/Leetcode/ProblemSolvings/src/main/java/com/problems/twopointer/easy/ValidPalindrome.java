package com.problems.twopointer.easy;

public class ValidPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        // get converted string
        for(int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                result.append(String.valueOf(s.charAt(i)).toLowerCase());
            }
        }
        return result.toString().equals(result.reverse().toString());
    }
}
