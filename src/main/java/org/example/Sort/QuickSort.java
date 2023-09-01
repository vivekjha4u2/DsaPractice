package org.example.Sort;

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
//        Integer i = 2;
//        Integer j = 3;
//        swap(i,j);
////        Collections
//        System.out.println(i+" "+j);

//        String word = "ab";
//        int cw = 26-Math.abs(word.charAt(0)-word.charAt(1));
//        System.out.println(minTimeToType("bza"));
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.pollFirst();
//        System.out.println(arrayDeque);

//        List<Integer> list = new LinkedList<>();
//        list.add(2);list.add(4);
//        list.add(6);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        List<int[]> list = new ArrayList<>();
        int[] fop = new int[1];
        fop[0] = 2;
        list.add(fop);
//        System.out.println(list.toArray(new int[list.size()][]));
        System.out.println(list.toArray());

    }
    public static int minTimeToType(String word) {
        int time = 0;
        for(int i=0; i<word.length()-1; i++){
            if(i==0 && word.charAt(i)!='a'){
                time += Math.min(Math.abs(word.charAt(0) - 'a')
                        ,26-Math.abs(word.charAt(0) - 'a') );
            }
            int cw = Math.abs(word.charAt(i)-word.charAt(i+1));
            int acw = 26-Math.abs(word.charAt(i)-word.charAt(i+1));
            time += Math.min(cw, acw);
        }
        time += word.length();
        return time;
    }
    private static void swap(Integer i, Integer j) {
        int temp = i;
        i = j;
        j = temp;
    }
}
