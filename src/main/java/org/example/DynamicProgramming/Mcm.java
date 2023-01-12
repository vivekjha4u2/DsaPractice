package org.example.DynamicProgramming;

public class Mcm {
    public static void main(String[] args) {
        int [] arr = new int[]{2,3,5,6,2};
        int n = arr.length;
        Integer [][] dp = new Integer[n+1][n+1];
        System.out.println(solve(arr, 1, n-1, dp));

    }

    static int solve(int[] arr, int i, int j, Integer [][] dp){
        if(dp[i][j] != null) return dp[i][j];
        if(i >= j) return 0;
        dp[i][j] = Integer.MAX_VALUE;
        for(int k=i; k<j; k++){
            dp[i][j] = Math.min(dp[i][j], solve(arr, i, k, dp)
                    + solve(arr, k+1, j, dp)
                    + arr[i-1]*arr[k]*arr[j]);
        }
        return dp[i][j];
    }

//    static int solve(int[] arr, int i, int j){
//        int min = Integer.MAX_VALUE;
//        if(i >= j) return 0;
//        for(int k=i; k<j; k++){
//            int temp = solve(arr, i, k) + solve(arr, k+1, j) + arr[i-1]*arr[k]*arr[j];
//            if(temp < min) min = temp;
//        }
//        return min;
//    }
}
