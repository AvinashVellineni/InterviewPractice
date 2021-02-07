package com.problems.binarySearch.easy;

public class BadVersion {
    public static void main(String[] args){
        System.out.println(firstBadVersion(2));
    }
    public static int firstBadVersion(int n){
        if(n==1){
            return 1;
        }else {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (isBadVersion(mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left + 1;
        }
    }
    public static boolean isBadVersion(int version){

        if(version+1>=2){
            return true;
        }
        return false;
    }
}
