package org.example.java8_features.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamExample {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        System.out.println("Sum of numbers are : " + sumOfNumbers(integerList));

        System.out.println("Sum of numbers using IntStream are : " + sumOfNumbersIntStream());


    }

    private static int sumOfNumbersIntStream() {
        return IntStream.rangeClosed(1,6)
                .sum();
    }

    public static int sumOfNumbers(List<Integer> integerList){
        return  integerList.stream() // Stream<Integer>
                .reduce(0,(x,y)->x+y); // unboxing to convert Integer to an int.
    }

    void rangeAndRangeClosed(){
        IntStream.range(1,50); //exclude 50
        IntStream.rangeClosed(1,50);//include 50
        LongStream.range(1,50);//Similar
//        DoubleStream does not have range and rangeClosed, Alternate way to get doubleStream is:
        IntStream.rangeClosed(1,50).asDoubleStream();
    }

    void aggregate(){
        //Aggregate
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum : "+ sum);

        OptionalInt max = IntStream.rangeClosed(1,50).max();
        System.out.println(max.isPresent());
        System.out.println(max.getAsInt());

        OptionalLong min = LongStream.rangeClosed(1,50).min();
        System.out.println(min.getAsLong());

        OptionalDouble avg = IntStream.rangeClosed(1,50).average();
        System.out.println(avg.getAsDouble());
    }

    //Boxing and Unboxing
    public static List<Integer> boxing() {

        return IntStream.rangeClosed(1,25)
                .boxed() //Stream<Integer>
                //all the elements will be passed one by one to get to the result as the collection.
                .collect(Collectors.toList());

    }

    public static int unBoxing(List<Integer> integerList) {

        int sum =  integerList.stream()
                .mapToInt(Integer::intValue).sum();
        return sum;

    }

    //MAP to Long, Map to Obj, Map to double
    static List<Integer> mapToObj(){ //can map to custom object
        return IntStream.rangeClosed(1,10)
                .mapToObj(i->new Integer(i))
                .collect(Collectors.toList());
    }
}
