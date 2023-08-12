package org.example.random;

import java.util.Arrays;

public class MakeKSubArraySumEqual {
    public static void main(String[] args) {
        MakeKSubArraySumEqual m = new MakeKSubArraySumEqual();
        int [] arr = new int[]{1,7,9,6};
        int k = 1;
        System.out.println(m.minOperations(arr,k));
    }

    public long makeSubKSumEqual(int[] arr, int k) {
        int n = arr.length;
        int dar[] = new int [n+k];
        for(int i=0; i<n; i++) dar[i] = arr[i];

        for(int i=n; i<n+k; i++) {
            dar[i] = arr[i-n];
        }

        //sliding window
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i=0; int j=0;
        int curSum = 0;

//        if(k==1){
//            int sum = 0;
//            for(int p: arr){
//                sum+=p;
//            }
//            for(int p: arr){
//                sum - p;
//            }
//        }
        while(j<k){
            curSum += dar[j];
            j++;
        }

        while(j < n+k){

            max = Math.max(curSum, max);
            min = Math.min(curSum, min);
            curSum += dar[j];
            curSum -= dar[i];
            i++;
            j++;
        }
        return Math.abs(max-min);
    }

    public int minOperations(int[] arr, int k) {
        int n = arr.length;
        int targetSum = Arrays.stream(arr).sum() / (n / k);
        int[] subarraySums = new int[n];
        int windowSum = Arrays.stream(arr, 0, k).sum();
        for (int i = 0; i < n; i++) {
            subarraySums[i] = windowSum;
            windowSum += arr[(i + k) % n] - arr[i % n];
        }
        int minOperations = Integer.MAX_VALUE;
        int[] doubledArr = new int[2 * n];
        System.arraycopy(arr, 0, doubledArr, 0, n);
        System.arraycopy(arr, 0, doubledArr, n, n);
        for (int i = 0; i < n; i++) {
            int operations = 0;
            for (int j = i; j < i + n; j += k) {
                int subarraySum = subarraySums[j % n];
                operations += Math.abs(subarraySum - targetSum);
            }
            minOperations = Math.min(minOperations, operations);
        }
        return minOperations;
    }

}

