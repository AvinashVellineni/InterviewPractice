package com.problems.string.easy;

import java.util.Arrays;

public class NumberOFNonSpacedCharacters {
    public static void main(String[] args){
        System.out.println(countSegments(", , , ,        a, eaefa"));
    }

    public static int countSegments(String s) {
        return (int)Arrays.stream(s.split(" ")).filter(element -> !element.isEmpty()).count();
    }
}
