package org.example;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{34, 23, 45, 56, 76, 32};
//        List<Integer> list =  Arrays.stream(nums).map(num->num).filter(num -> {
//            boolean ls = IntStream.range(2,num/2).noneMatch(i->num%i == 0);
//            return ls;
//        }).collect(Collectors.toList());
        Arrays.asList(nums);


//        public static void primeFactors ( int n)
//        {
//            int c = 2;
//            while (n > 1) {
//                if (n % c == 0) {
//                    System.out.print(c + " ");
//                    n /= c;
//                } else
//                    c++;
//            }
//        }
    }
}
