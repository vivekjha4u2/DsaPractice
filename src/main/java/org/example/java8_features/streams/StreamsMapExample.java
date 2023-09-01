package org.example.java8_features.streams;

import org.example.java8_features.data.Student;
import org.example.java8_features.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static void main(String[] args) {
        System.out.println("namesUpperCase List : " + namesUpperCase(StudentDataBase.getAllStudents()));
        System.out.println("namesUpperCase Set : " + namesSetUpperCase(StudentDataBase.getAllStudents()));
        System.out.println("namesLengthMap : " + namesLengthMap(StudentDataBase.getAllStudents()));
    }

    private static Map<String, Integer> namesLengthMap(List<Student> allStudents) {
        return allStudents.stream()
                .map(Student::getName)
                .collect(Collectors.toMap(String::toString, String::length));
    }

    private static Set<String> namesSetUpperCase(List<Student> allStudents) {
        return allStudents.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }

    private static List<String> namesUpperCase(List<Student> allStudents) {
        return allStudents.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .toList();
    }

}
