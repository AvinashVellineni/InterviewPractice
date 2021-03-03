package com.problems.math.easy;

import java.util.HashMap;

public class ExcelColumnToNumbers {
    public static void main(String[] args){
        System.out.println(titleToNumber("AAA"));
    }
    public static int titleToNumber(String s) {
        HashMap map = new HashMap();
        map.put('A',1);
        for(int i=1;i<=25;i++){
            map.put((char) ('A'+i),i+1);
        }
        int sum =0;
        for(int i=0;i<s.length()-1;i++){
            sum+= (Math.pow(26,s.length()-(i+1))*(int)map.get(s.charAt(i)));
        }
        sum+=(int)map.get(s.charAt(s.length()-1));
        return sum;
    }
}
