package com.problems.arrays.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {
    public  static void main(String[] args){
        List<List<Integer>> result = new LinkedList<>();
        result=generate(5);
        for(int i=0;i<result.size();i++){
            System.out.println(Arrays.toString(result.get(i).toArray()));
        }

    }
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new LinkedList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> intermediateResults = new LinkedList<>();
            for(int j=0; j<=i;j++){
                if(j==0 || j==i){
                    intermediateResults.add(1);
                }else {
                    intermediateResults.add(result.get(i-1).get(j) + result.get(i-1).get(j-1));
                }
            }
            result.add(intermediateResults);
        }
        return result;
    }
}
