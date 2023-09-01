package org.example.java8_features.streams;

import org.example.java8_features.data.Student;
import org.example.java8_features.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,7);
        //List<Integer> integerList = Arrays.asList();

        System.out.println("Result is : " + performMultiplication(integerList));
        Optional<Integer> result = performMultiplicationWithNoInitialValue(integerList);
        result.ifPresent(System.out::println);

        System.out.println(getHighestGradeStudent().get());

        System.out.println("findMaxValue: "+findMaxValue(integerList));
        System.out.println("findMinValue: "+findMinValue(integerList));
    }

    private static Optional<Integer> findMinValue(List<Integer> integerList) {
        return integerList.stream() //either use IntMAX to initialize or simply optional way
                .reduce((x,y)->x<y?x:y);
    }

    private static int findMaxValue(List<Integer> integerList) {
        return integerList.stream()
//                .limit(3).skip(2)
                .reduce(0,(a,b)->a>b?a:b);
    }

    private static Optional<Student> getHighestGradeStudent() {
        return StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1,s2)->s1.getGpa()>s2.getGpa()?s1:s2);
    }

    private static Optional<Integer> performMultiplicationWithNoInitialValue(List<Integer> integerList) {
        return integerList.stream().reduce((a,b)->a*b);
    }

    private static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1,(a,b)->a*b);
    }
}
