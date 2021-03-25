package com.problems.hashtable.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public static void main(String[] args){
        System.out.println(wordPattern("abba","dog cat cat fish"));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] input = s.split(" ");
        if(pattern.length() != input.length){
            return false;
        }
        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(int i=0;i<pattern.length();i++){
           if(!map.containsKey(pattern.charAt(i))){
               if(set.contains(input[i])){
                    return false;
               }
               set.add(input[i]);
               map.put(pattern.charAt(i),input[i]);
           }else {
               if(map.get(pattern.charAt(i)).equals(input[i])){
                   continue;
               }else {
                   return false;
               }
           }
        }
        return true;
    }
}
