package org.example.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetSubarrayBeauty {
    public static void main(String[] args) {
        int nums[] = new int[]{1,-1,-3,-2,3};
        int k = 3, x = 2;
        int[] rs = getSubarrayBeauty(nums,k,x);
        for(int i: rs) System.out.print(i+" ");
    }

    // TLE
    public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int i=0;
        int j=0;
        int n = nums.length;

        int p=0;
        int []res = new int[n-k+1];

        List<Integer> window = new ArrayList<>();
        while(i<k){
            window.add(nums[i]);
            i++;
        }

        while(i<n){
            List<Integer> wc = new ArrayList<>();
            for(int num: window){
                wc.add(num);
            }
            Collections.sort(wc);
            if(wc.get(x-1) <= 0){
                res[p] = wc.get(x-1);
                p++;
            }
            window.add(nums[i]);
            window.remove(j);
            i++;
        }
        if(i==n){
            Collections.sort(window);
            res[p] = window.get(x-1);
        }
        return res;
    }
}
