package org.example.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReduceArrSizeToHalf {
    public static void main(String[] args) {
        //1338. Reduce Array Size to The Half
        int [] arr = new int[]{3,3,3,3,2,1,4,4,2,1};

        System.out.println(minSetSize(arr));

    }

    public static int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
//            map.put(i, map.getOrDefault(i,0)+1);
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        int half = arr.length/2;
        int count = 0;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: map.values()){
            maxHeap.add(i);
        }

        while(!maxHeap.isEmpty() && half>0){
            half -= maxHeap.poll();
            count++;
        }
        return count;


    }
}
