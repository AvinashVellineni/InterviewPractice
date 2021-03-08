package com.problems.backtracking.easy;

import java.util.LinkedList;
import java.util.List;

public class BinaryWatch {
    public static void main(String[] args){
       System.out.println(readBinaryWatch(1).toString());
    }

    public static List<String> readBinaryWatch(int num) {
        List<String> result = new LinkedList<>();
        for(int i=0; i<=11; i++){
            for(int j=0; j<=59; j++){
                if(Integer.bitCount(i) + Integer.bitCount(j) == num){
                    String minute = j>=10 ? String.valueOf(j) : "0"+j;
                    result.add(i+":"+ minute);
                }
            }
        }
        return result;
    }
}
