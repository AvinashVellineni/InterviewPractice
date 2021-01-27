package com.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSumSequential {
    public static void main(String[] args){
        int[] numbers = new int[] {-1,0,1,2,-1,-4};
        System.out.println(threeSum(numbers));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<Integer> inputList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        inputList.sort((e1,e2) -> e1.compareTo(e2));
        List<List<Integer>> output = new ArrayList<>();
        System.out.println(inputList);
        for(int i=0;i<inputList.size()-3;i++){
            List<Integer> eachTemporaryOutput = new ArrayList<>();
            if(inputList.get(i) + inputList.get(i+1) + inputList.get(i+2) == 0){
                eachTemporaryOutput.add(inputList.get(i));
                eachTemporaryOutput.add(inputList.get(i+1));
                eachTemporaryOutput.add(inputList.get(i+2));
                output.add(eachTemporaryOutput);
            }
        }
        return output;
    }
}
