package com.problems.arrays.easy;

import java.util.Arrays;
import java.util.List;

public class PascalsTriangle2 {
    public static void main(String[] args){
        System.out.println(getRow(3));
    }
    public static List<Integer> getRow(int rowIndex) {
        Integer[] result =  new Integer[rowIndex + 1];
        Arrays.fill(result, 0);
        result[0] = 1;
        for(int i = 1; i < rowIndex + 1; i++){
            for(int j = i; j >= 1; j--){
                result[j] += result[j - 1];
            }
        }
        return Arrays.asList(result);
    }
}
