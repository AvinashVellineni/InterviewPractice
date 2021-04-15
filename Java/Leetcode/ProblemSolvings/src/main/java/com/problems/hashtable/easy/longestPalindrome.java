package com.problems.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

public class longestPalindrome {
    public static void main(String[] args){
        System.out.println(longestPalindrome("abccccdd"));
    }

    public static int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
                if(map.get(c)%2 == 0){
                    count++;
                }
            }else {
                map.put(c,1);
            }
        }
        int count_singledigit = 0;
        for(Character c : map.keySet()){
            if(map.get(c)%2!=0){
                count_singledigit++;
                break;
            }
        }
        return count*2 + count_singledigit;
    }
}
