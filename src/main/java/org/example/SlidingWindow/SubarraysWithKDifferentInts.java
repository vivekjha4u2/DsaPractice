package org.example.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubarraysWithKDifferentInts {
    public static void main(String[] args) {
        System.out.println(subarraysWithKDistinct(new int[]{1,2,1,2,3}, 2));
    }
    public static int subarraysWithKDistinct(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int count=0;
        int i=0,j=0;
        while(j<nums.length){
            hm.put(nums[j], hm.getOrDefault(nums[j],0)+1);
            if(hm.size()<k){
                j++;
            }else if(hm.size() > k){
                if(hm.get(nums[j]) > 1)
                    hm.put(nums[j], hm.get(nums[j])-1);
                else
                    hm.remove(nums[j]);
                j--;
                while(hm.size()==k){
                    if(hm.get(nums[i]) > 1)
                        hm.put(nums[i], hm.get(nums[i])-1);
                    else
                        hm.remove(nums[i]);
                    i++;
                    if(hm.size() == k) count++;
                }
            }
            else if(hm.size() == k){
                j++;
                count++;
            }

        }
        return count;
    }
}



//        Set<Integer> hs = new HashSet<>();
//        int count=0;
//        int i=0,j=0;
//        while(j<nums.length){
//            hs.add(nums[j]);
//            if(hs.size()<k){
//
//                j++;
//            }else if(hs.size() > k){
//                hs.remove(nums[j]);
//                while(hs.size()==k){
//                    hs.remove(nums[i]);
//                    i++;
//                    if(hs.size() == k) count++;
//                }
//            }
//            else if(hs.size() == k){
//                j++;
//                count++;
//            }
//
//        }
//        return count;