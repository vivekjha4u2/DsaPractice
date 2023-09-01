package org.example.SlidingWindow;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int n=nums.length;
        int curSum = 0;
        int min = n+1;
        while(j < n){
            curSum += nums[j];
            while(curSum >= target){
                System.out.print(curSum+" : "+j+","+i+"\n");
                if(curSum >= target && (j-i+1)<min ){
                    min = j-i+1;
                }
                curSum -= nums[i];
                i++;
            }
            j++;
        }
        return min>n?0:min;
    }
}
