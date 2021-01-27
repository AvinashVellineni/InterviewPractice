package com.problems.arrays.easy;

import com.sun.tools.javac.util.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PlusOne {
    public static void main(String[] args){
        int[] input = new int[] {9,9,9};
        System.out.println(Arrays.toString(plusOne(input)));
    }
    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        return newNumber;
    }
}
