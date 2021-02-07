package com.problems.binarySearch.easy;

public class SquareRoot {
    public static void main(String[] args){
        System.out.println(mySqrt(16));
    }

    public static int mySqrt(int x) {
        long left = 1;
        long right = x;
        if(x<2){
            return x;
        }
        while(left<right){
            long mid = left + (right-left)/2 ;
            if(mid*mid == x){
                return (int)mid;
            }else if(mid*mid > x){
                right=mid;
            }else if(mid * mid < x){
                left = mid+1;
            }
        }
        return (int)(left-1);
    }
}
