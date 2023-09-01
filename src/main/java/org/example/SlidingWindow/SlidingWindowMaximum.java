package org.example.SlidingWindow;

import java.util.ArrayDeque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int [] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int [] ans = maxSlidingWindow(nums, 3);
        for(int l: ans)
            System.out.print(l+" ");
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        // 1,3,-1,-3,5,3,6,7
        // ans[3,3,5,5,6,7]   arrdeq[7]
        //IP: [1,3,1,2,0,5]
        int i=0, j=0, n=nums.length;
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        int[] ans = new int[n-k+1];
        int p=0;
        while(j<n){
            while(ad.isEmpty()==false && ad.peekLast() < nums[j]){
                ad.pollLast();
            }
            ad.addLast(nums[j]);

            if(j-i+1==k){
                ans[p] = ad.peekFirst();
                p++;
                if(ad.peekFirst() == nums[i]){
                    ad.pollFirst();
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}
