package org.example.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertArrInto2dList {
    public static void main(String[] args) {
        int nums[] = new int[]{1,3,4,1,2,3,1};
        ConvertArrInto2dList c  = new ConvertArrInto2dList();
        System.out.println(c.findMatrix(nums));
    }
    public List<List<Integer>> findMatrix(int[] nums) {
        List<Set<Integer>> list = new ArrayList<>();
        Set<Integer> se = new HashSet<>();
        list.add(se);
        for(int i=0; i<nums.length; i++){
            int j=0;
            while(j < list.size()){
                Set<Integer> set = list.get(j);
                if(!set.contains(nums[i])){
                    set.add(nums[i]);
                    break;
                }
                else if(set.contains(nums[i]) && j==list.size()-1){
                    Set<Integer> s = new HashSet<>();
                    s.add(nums[i]);
                    list.add(s);
                    break;
                }
                j++;
            }

        }
        List<List<Integer>> res = new ArrayList<>();
        for(Set<Integer> s: list){
            List<Integer> li = new ArrayList<>(s);
            res.add(li);

        }
        return res;

    }
}
