package org.example.DynamicProgramming;

public class SubsetSum {
    public static void main(String[] args) {
        int [] nums = new int[]{1,5,11,5};
        int sum = 11;
        int n = 4;
        System.out.println(isSubset(sum,nums,n));
        System.out.println(canPartition(nums));
    }

    static boolean isSubset(int sum, int[] nums, int n){
        boolean[][] dp =new boolean[n+1][sum+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0) dp[i][j]=false;
                else if(j==0) dp[i][j]=true;
                else if(nums[i-1]<=j){
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];

    }

    public static boolean canPartition(int[] nums) {
        int sum=0;
        for(int num: nums) sum+=num;
        if(sum % 2 != 0) return false;
        return isSubset(sum/2,nums,nums.length);
    }
}
