package com.boomi.problems;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 22, "12th", 85));
        studentList.add(new Student("Bob", 20, "10th", 65));
        studentList.add(new Student("Adam", 18, "9th", 80));
        studentList.add(new Student("Amy", 19, "11th", 90));

        // Activity 1: Get all students whose name starts with A
        List<Student> aStudents = studentList.stream()
                .filter(s -> s.getName().startsWith("A"))
                .toList();
        System.out.println("Students whose name starts with A:");
        System.out.println(aStudents);

        // Activity 2: Get all students whose name starts with A and who have scored X percentage of marks
        int percentage = 80;
        List<Student> aStudentsWithMarks = studentList.stream()
                .filter(s -> s.getName().startsWith("A"))
                .filter(s -> s.getPercentage() >= percentage)
                .toList();
        System.out.println("Students whose name starts with A and have scored " + percentage + "% or more:");
        System.out.println(aStudentsWithMarks);

        // Activity 3: Convert Student objects to Human objects
        List<Human> humanList = studentList.stream()
                .map(s -> new Human(s.getName(), s.getAge()))
                .toList();
        System.out.println("Human objects converted from Student objects:");
        System.out.println(humanList);


    }
}