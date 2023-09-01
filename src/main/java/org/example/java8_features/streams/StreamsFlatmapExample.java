package org.example.java8_features.streams;

import org.example.java8_features.data.Student;
import org.example.java8_features.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsFlatmapExample {
    public static void main(String[] args) {
        System.out.println("Student Activities : " + printStudentActivities());
        System.out.println("Unique Student Activities : " + printUniqueStudentActivities());
        System.out.println("Unique Student Activities : " + printUniqueStudentActivitiesSorted());
        System.out.println("Unique Student Activities Count: " + getStudentActivitiesCount());
    }

    private static long getStudentActivitiesCount() {
        //set.size() --1
        //2
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    private static Set<String> printUniqueStudentActivities() {
        return StudentDataBase.getAllStudents().stream()
                .flatMap(student -> student.getActivities().stream())
                .collect(Collectors.toSet());
    }
    private static List<String> printUniqueStudentActivitiesSorted() {
        return StudentDataBase.getAllStudents().stream()
                .flatMap(student -> student.getActivities().stream())
                .distinct()
                .sorted()
                .toList();
    }

    private static List<String> printStudentActivities() {
        return StudentDataBase.getAllStudents().stream()
                .flatMap(student -> student.getActivities().stream())
                .toList();
    }
}
