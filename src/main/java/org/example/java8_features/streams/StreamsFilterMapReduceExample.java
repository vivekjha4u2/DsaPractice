package org.example.java8_features.streams;

import org.example.java8_features.data.Student;
import org.example.java8_features.data.StudentDataBase;

import java.util.function.Predicate;

public class StreamsFilterMapReduceExample {
    public static void main(String[] args) {
//        System.out.println("Total No of NoteBooks are : " + noOfNoteBooks());
        System.out.println("Total No of NoteBooks are : " + noOfNoteBooks1());
    }

    private static int noOfNoteBooks() {
        return StudentDataBase.getAllStudents().stream()
                .map(student -> student.getNoteBooks())
//                .reduce(0, Integer::sum)
                .reduce(0, (a, b) -> a + b);
    }

    static Predicate<Student> gpaFilter = (student->{
        return student.getGpa()==2.0;
    });

    private static int noOfNoteBooks1() {
        return StudentDataBase.getAllStudents().stream()
//                .filter(gpaFilter)
                .filter(student -> student.getGender().equals("male"))
//                .peek(System.out::println)
                .map(Student::getNoteBooks)
//                .peek(System.out::println)
                .reduce(0, Integer::sum);
//                .reduce(0, (a, b) -> a + b);
    }
}
