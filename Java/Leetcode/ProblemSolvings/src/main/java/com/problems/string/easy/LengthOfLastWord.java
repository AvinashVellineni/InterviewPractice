package com.problems.string.easy;

public class LengthOfLastWord {
    public static void main(String[] args){
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        int i=s.length()-1;
        while(i>=0 && (count==0 || s.charAt(i) != ' ')){
            if(s.charAt(i) != ' '){
                count++;
            }
            i--;
        }
        return count;
    }
}
