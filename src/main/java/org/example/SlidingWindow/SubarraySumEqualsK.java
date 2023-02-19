package org.example.SlidingWindow;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int nums[] = new int[]{1,1,1};
        int k = 2;
        int res = subarraySum(nums,k);
        System.out.println(res);
        System.out.println(subarraySum(new int[]{1}, 0));
        System.out.println(subarraySum(new int[]{-1,-1,1}, 0));
    }

    public static int subarraySum(int[] nums, int k) {
        int i=0,j=0;
        int sum=0;
        int count=0;
        while(j<nums.length){
            sum+=nums[j];
            if(sum < k){
                j++;
            }
            if(sum > k){
                while(sum > k){
                    sum -= nums[i];
                    i++;
                }
            }
            if(sum == k) {//possible candidate for ans
                count++;
                j++;
            }

        }
        return count;
    }
}






//        Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//        A subarray is a contiguous non-empty sequence of elements within an array.

//        Example 1:
//        Input: nums = [1,1,1], k = 2
//        Output: 2
//        Example 2:
//
//        Input: nums = [1,2,3], k = 3
//        Output: 2

// nums[1] ,k=0 -> op = 0
// nums[-1,-1,1], k=0 -> op = 1