package org.example.java8_features;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        String str = "abc2xyi3";
        long product = 1;
        for(char c: str.toCharArray()){
            int temp = c-'0';
            if(temp>=0 && temp <=9){
                product = product * temp;
            }
        }
//        Stream.of(str.toCharArray()).filter(c->{
//
//        })
//
//        int prod = str.chars().mapToObj(c->(char)c).filter(i-> i-'0'>=0 && i-'0'<=9).map(i-> product*=i)
//                .reduce(1,(a, b)-> a*b);
//        System.out.println(prod);
//
//        System.out.println(product);

        List<Integer> arr = Arrays.asList(1,1,2,2,2,2,3,3,3);
//        int [] freq = new int[256];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.size(); i++){
            int num = arr.get(i);
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        Collections.sort(arr, (i1,i2)->map.get(i2).compareTo(map.get(i1)));
        System.out.println(arr);

        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>(arr);

//        {1:2
//        2:4
//        }
//        for (int num: set){
//            map.get(num)
//        }
//        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
//            int max = Integer.MIN_VALUE;
//            for
//        }

//        Collections.sort();

//        Employee - id,name,salary,depId
        //Dep - depId, name
//        List<Employee> list;
//        list.sort();
//        Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)
//         list.stream().collect(Collectors.groupingBy(e->e.getDepId))

        //emp
//        select d.name, Count(*)
//        from emp e
//        inner join dep d
//        on e.depId = d.depId
//        group by d.depId

    }

}
//class Employee implements Comparator{
//    int id;
//    String name;
//    int salary;
//
////    @Override
////    public int compare(Object e1, Object e2) {
////        int temp = e1.getName.comareTo(e2.getName);
////        if(temp ==0 ){
////            return e1.getId.compareTo(e2.getId);
////        }
////        return temp;
////    }
//}