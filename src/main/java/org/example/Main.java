package org.example;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
//    10
//    01
    //11
    //10
    public static void main(String[] args) {

        String s = "tree";
        s.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));


//        List<Integer> list = Arrays.asList(2,1,2,1,2);
//        int res=0;
//        for(int num:list){
//            res ^= num;
//        }
//        System.out.println(res);

//        if(1){
//            System.out.println("s");
//        }

//        while(true){
//            System.out.println("jk");
//        }

//        for(int i=0;;){
//            System.out.println("s");
//        }


//        Integer a = 100;
//        Integer b = 100;
//        System.out.println(a==b);
//for a in range -128 to 127 java does caching in Integer class a==b -> true, else false

//        String s1 = new String("ABC");
//        String s2 = new String("ABC");
//        String s3 = "ABC";
//
//        System.out.println(s1.equals(s2) );
//        System.out.println(s1 == s2 );
//        System.out.println(s1 == s3 );
//        System.out.println(s1.equalsIgnoreCase(s2) );
//        System.out.println(s1 == "ABC" );

//        int n=10;
//        System.out.print(1+" ");
//        System.out.print(1+" ");
//        int n1=1,n2=1;
//        for(int i=2;i<n;i++){
//            int n3 = n1+n2;
//            System.out.print(n3+" ");
//            n1 = n2;
//            n2 = n3;
//        }
//        System.out.println();

//        int[] nums = new int[]{-1};
//        int k=1;
//        double max=Integer.MIN_VALUE, avg=0.0;
//        for(int i=0; i<nums.length; i++){
//            avg += (double)nums[i]/k;
//            if(i >= k-1){
//                max = Math.max(max, avg);
//                avg -= (double) nums[i-k+1]/k;
//            }
//        }
//        System.out.println(max);



//        List<Integer> list =  Arrays.stream(nums).map(num->num).filter(num -> {
//            boolean ls = IntStream.range(2,num/2).noneMatch(i->num%i == 0);
//            return ls;
//        }).collect(Collectors.toList());
//        Arrays.asList(nums);


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

//        int[] nums = new int[]{-1,-100,3,99};
////        int[] res = twoSum(nums, 9);
////        System.out.println(res[0]+" "+res[1]);
//        rotate(nums,2);
//        for (int num : nums) {
//            System.out.print(num+" ");
//        }

    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length; i++){
            int n1 = target-nums[i];
            if(map.containsKey(n1)){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        return result;
    }

    public static void rotate(int[] nums, int k) {//1,2,3,4,5,6,7
        int n = nums.length;
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
    }

    static void reverse(int[] nums, int s, int e){
        while(s<=e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;e--;
        }
    }

//    static int fib(int n){
//
//        if(n == 1 || n==0) return n;
////        System.out.print(n3+" ");
//        return fib(n-2) + fib(n-1);
//    }
}
