package com.problems.backtracking.easy;

public class CountOfMatches {
    public static void main(String[] args){
        System.out.println(numberOfMatches(3));
    }
    public static int numberOfMatches(int n) {

        int numberOfMatches = 0;
        int noOfTeamsAdvancedToNextLevel = Integer.MAX_VALUE;
        while(noOfTeamsAdvancedToNextLevel != 1){
            if(n%2 == 0){
                numberOfMatches += n/2;
                noOfTeamsAdvancedToNextLevel = n/2;
            }else {
                numberOfMatches += (n-1)/2;
                noOfTeamsAdvancedToNextLevel = ((n-1)/2) +1;
            }
            n=noOfTeamsAdvancedToNextLevel;
        }
        return numberOfMatches;
    }
}
