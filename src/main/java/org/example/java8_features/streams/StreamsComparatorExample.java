package org.example.java8_features.streams;

import org.example.java8_features.data.Student;
import org.example.java8_features.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
    public static void main(String[] args) {
        System.out.println("Students sorted by NAME");
        sortStudentsByName().forEach(System.out::println);

        System.out.println("Students sorted by GPA");
        sortStudentsByGpa().forEach(System.out::println);
//
//        System.out.println("Students sorted by GPA Higher to Lower");
//        sortStudentsByGpaReversed().forEach(System.out::println);
    }

    private static List<Student> sortStudentsByGpa() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa, Comparator.reverseOrder()))
                .toList();
    }

    private static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName).thenComparing(Student::getGpa))//then gpa
                .toList();
    }

}
