package com.problems.math.easy;

public class ExcelColumn {
    public static void main(String[] args){
        System.out.println(convertToTitle(5));
    }

    public static String convertToTitle(int n) {
        StringBuilder builder = new StringBuilder();
        while(n>0){
            builder.append((char) ('A'+(n-1)%26));
            n= (n-1)/26;
        }
        return builder.reverse().toString();
    }
}
