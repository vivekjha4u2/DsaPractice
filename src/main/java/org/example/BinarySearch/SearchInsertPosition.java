package org.example.BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] nums = new int[]{1,3,4,5};
        System.out.println(searchInsert(nums,6));
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int mid = 0;
        while(start < end){
            mid = (start + (end-start))/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return mid;
    }
}
