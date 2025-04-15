package org.example;

import org.example.domain.Lesson;
import org.example.domain.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        var lesson1 = new Lesson("math", 20);
        Lesson lesson2 = new Lesson("phis", 10);
        Lesson lesson3 = new Lesson("chem", 15);
        Lesson lesson4 = new Lesson("liter", 10);
        Lesson lesson5 = new Lesson("fiz", 20);
        Lesson lesson6 = new Lesson("java", 30);

        List<Student> students = List.of(
                new Student("student1", 1, 30, List.of(lesson1, lesson3)),
                new Student("student2", 1, 40, List.of(lesson1, lesson2)),
                new Student("student3", 2, 35, List.of(lesson1, lesson2, lesson4, lesson5)),
                new Student("student4", 3, 30, List.of(lesson1, lesson3, lesson4)),
                new Student("student5", 3, 50, List.of(lesson1, lesson3, lesson5, lesson6)),
                new Student("student6", 4, 10, List.of(lesson2, lesson4)),
                new Student("student7", 5, 20, List.of(lesson3, lesson6)));

        Stream<Student> stream = students.stream();

        OptionalDouble average = stream
                .map(Student::getMark)
                .mapToInt(value -> value)
                .average();

        if (average.isPresent()) {
            double asDouble = average.getAsDouble();
            System.out.println("Double mark : " + asDouble);
        }

        Map<String, Integer> avLessons = students.stream()
                .collect(Collectors.toMap(Student::getUsername, st -> st.getLessons().size()));

        System.out.println("AvrLessons: " + avLessons);

        int javaSum = students.stream()
                .flatMap(st -> st.getLessons().stream())
                .filter(les -> les.equals(lesson6))
//                .map(les -> les.getCount())
                .mapToInt(Lesson::getCount)
                .sum();

        System.out.println("Java sum : " + javaSum);

        Map<Integer, Integer> collect = students.stream()
                .collect(Collectors.groupingBy(Student::getCourse, Collectors.summingInt(Student::getMark)));

        System.out.println("Sum of courses mark: " + collect);

        Map<Integer, Double> collect1 = students.stream()
                .collect(Collectors.groupingBy(Student::getCourse, Collectors.averagingInt(Student::getMark)));

        System.out.println("Avr of courses mark: " + collect1);

        Map<String, Long> collect2 = students.stream()
                .flatMap(st -> st.getLessons().stream())
                .collect(Collectors.groupingBy(Lesson::getName, Collectors.counting()));

        System.out.println("Count of lessons: " + collect2);

        int sum = students.stream()
                .mapToInt(Student::getMark)
                .sum();

        System.out.println("Sum of courses mark: " + sum);

        OptionalInt sumOpt = students.stream()
                .mapToInt(Student::getMark)
                .reduce((x, y) -> x + y);

        if (sumOpt.isPresent()) {
            System.out.println("Sum of courses mark: " + sumOpt.getAsInt());
        }

    }

}