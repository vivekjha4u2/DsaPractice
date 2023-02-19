package org.example;

import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {
        int nums[] = new int[]{5,4,7,2,9,1};
        bubble(nums);
        for(int i: nums){
            System.out.print(i + " ");
        }
    }

    public static void bubble(int[] nums) { //5,4,7,2,9,1
        int n = nums.length;
        for (int i = 0; i < n; i++) { //i is just for number of iteration
            for (int j = 0; j < n-i-1; j++) { // j -> 0 to last--
                if(nums[j] > nums[j+1]){ // compare j,j+1
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void mergesort(int [] nums){

    }

}
