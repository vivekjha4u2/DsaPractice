package org.example.random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfDistances {
//    6360. Sum of Distances
    public static void main(String[] args) {
int [] nums= new int[]{1,3,1,1,2};
SumOfDistances s = new SumOfDistances();
        System.out.println(s.distance(nums));
    }

    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        Map<Integer, List<Long>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add((long)i);
            }else{
                List<Long> temp = new ArrayList<>();
                temp.add((long)i);
                map.put(nums[i], temp);
            }
        }

        for(int i=0; i<n; i++){

            List<Long> list = map.get(nums[i]);

            int sum = 0;
            for(long p: list){
                sum+= Math.abs(i-p);
            }
            arr[i] = sum;


        }
        return arr;
    }
}
