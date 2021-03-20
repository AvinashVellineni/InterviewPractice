package com.problems.hashtable.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args){
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {
        Set set = new HashSet();
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            int temp = n;
            int newN = 0;
            while(temp>0){
                newN += (temp%10) * (temp%10);
                temp /=10;
            }
            n=newN;
        }
        return true;
    }
}
