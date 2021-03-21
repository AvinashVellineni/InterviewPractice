package com.problems.hashtable.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CountPrime {
    public static void main(String[] args){
        System.out.println(countPrimes(499979));
    }
    public static int countPrimes(int n) {
        if (n < 3)
            return 0;

        boolean[] f = new boolean[n];
        int count = n / 2;
        for (int i = 3; i * i < n; i += 2) {
            if (f[i])
                continue;

            for (int j = i * i; j < n; j += 2 * i) {
                if (!f[j]) {
                    --count;
                    f[j] = true;
                }
            }
        }
        return count;
    }
}
