package org.example.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int [] nums = new int[]{10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> result = combinationSum2(nums, target);
        for(List<Integer> i: result){
            System.out.println(i);
        }
    }
    public static List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list,nums,new ArrayList<>(), target,0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, int[] nums, List<Integer> tempList, int remain, int start) {
        if(remain < 0) return;
        else if(remain == 0){
            list.add(new ArrayList<>(tempList));
        }else{
            for(int i=start; i<nums.length; i++){
                if(i>start && nums[i] == nums[i-1]) continue;
                tempList.add(nums[i]);
                backtrack(list, nums, tempList, remain-nums[i], i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
