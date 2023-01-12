package org.example.DynamicProgramming;

public class Knapsack01 {
    public static void main(String[] args) {
        int capacity = 22;
        int [] wt = new int[]{12, 32, 45, 31, 10};
        int [] val = new int[]{100, 200, 120, 320, 120};
        int n = wt.length;
        Integer [][] dp = new Integer[n+1][capacity+1];
        int maxProfitMemoized = knapsackMemoiz(wt, val, capacity, n, dp);
        int maxProfitBottomUp = knapsackBottomUp(wt, val, capacity, n, dp);
        int maxProfitBottomUp2 = knapsackBottomUp(wt, val, capacity, n, dp);
        System.out.println("maxProfitMemoized : " + maxProfitMemoized);
        System.out.println("maxProfitBottomUp : " + maxProfitBottomUp);
        System.out.println("maxProfitBottomUp2 : " + maxProfitBottomUp2);
    }

    private static int knapsackMemoiz(int[] wt, int[] val, int capacity, int n, Integer[][] dp) {
        if(n == 0 || capacity == 0) return dp[n][capacity] = 0;
        if(dp[n][capacity] != null) return dp[n][capacity];
        if(wt[n-1] <= capacity){
            dp[n][capacity] = Math.max(val[n-1] + knapsackMemoiz(wt,val,capacity-wt[n-1],n-1,dp),
                    knapsackMemoiz(wt,val,capacity,n-1,dp));
        }else{
            dp[n][capacity] = knapsackMemoiz(wt,val,capacity,n-1,dp);
        }
        return dp[n][capacity];
    }
    //Time Complexity: O(N * W). where ‘N’ is the number of elements and ‘W’ is capacity.
    //Auxiliary Space: O(N * W). The use of a 2-D array of size ‘N*W’.

    //    -----------------------------------------------------
    private static int knapsackBottomUp(int[] wt, int[] val, int capacity, int n, Integer[][] dp) {
        for(int i=0; i<n; i++){
            for(int j=0; j<capacity; j++){
                if(i==0 || j==0) dp[i][j] = 0;
                else if(wt[i-1] <= j){
                    dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][capacity];
    }
    //Time Complexity: O(N * W)
    //Auxiliary Space: O(N * W)

//    -----------------------------------------------------
    // We know we are always using the current row or
    // the previous row of the array/vector . Thereby we
    // can improve it further by using a 2D array but
    // with only 2 rows i%2 will be giving the index
    // inside the bounds of 2d array K
    private static int knapsackBottomUp2(int[] wt, int[] val, int capacity, int n, Integer[][] dp) {
        dp = new Integer[2][capacity+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<capacity; j++){
                if(i==0 || j==0) dp[i%2][j] = 0;
                else if(wt[i-1] <= j){
                    dp[i%2][j] = Math.max(val[i-1] + dp[(i-1)%2][j-wt[i-1]], dp[(i-1)%2][j]);
                }else{
                    dp[i%2][j] = dp[(i-1)%2][j];
                }
            }
        }
        return dp[n%2][capacity];
    }
    //Time Complexity: O(N * W)
    //Auxiliary Space: O(N * 2)
}
