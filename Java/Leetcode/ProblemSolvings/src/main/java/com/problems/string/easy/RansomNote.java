package com.problems.string.easy;

public class RansomNote {
    public static void main(String[] args){
        System.out.println(canConstruct("aa","aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        if(magazine.length()<ransomNote.length()){
            return false;
        }
        if(ransomNote.isEmpty() || magazine.isEmpty()){
            return true;
        }

        for(int i=0;i<ransomNote.length();i++){
            String s = String.valueOf(ransomNote.charAt(i));
            if(magazine.contains(s)){
                int index = magazine.indexOf(s);
                magazine = magazine.substring(0,index) + magazine.substring(index+1);
            }else {
                return false;
            }
        }
        return true;
    }
}
