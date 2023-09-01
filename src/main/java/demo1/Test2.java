package demo1;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5,7,3,4);
        Map<Integer, Integer> l1 = list.stream().collect(Collectors.toMap(Function.identity(), i->i*i));

//        for (Map.Entry<Integer,Integer> d: l1.entrySet()) System.out.println(d);


        Long l2 = list.stream().collect(Collectors.counting());

//        Map<Integer, List<Integer>> map = list.stream().collect(Collectors.groupingBy());

//        for(int p: map.get(4))
//            System.out.println(p);
    }

}
