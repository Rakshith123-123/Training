package com.boomi.custom;

import java.util.ArrayList;
import java.util.List;

public class CustomSet<T> {

    private List<T> elements;

    public CustomSet() {
        this.elements = new ArrayList<>();
    }

    public CustomSet(List<T> elements) {
        this.elements = new ArrayList<>(elements);
    }

    public boolean add(T element) {
        return elements.add(element);
    }

    public boolean remove(T element) {
        return elements.remove(element);
    }

    public boolean contains(T element) {
        return elements.contains(element);
    }

    public int size() {
        return elements.size();
    }

    public List<T> getElements() {
        return new ArrayList<>(elements);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 123);
        Student s2 = new Student("Bob", 456);
        Student s3 = new Student("Charlie", 789);
        Student s4 = new Student("Rasa", 123);

        CustomSet<Student> studentSet = new CustomSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s2);
        studentSet.add(s4);

        System.out.println("Student set size: " + studentSet.size());
        System.out.println("Student set contains Bob? " + studentSet.contains(s2));

        List<Student> studentList = studentSet.getElements();
        System.out.println("Student list size: " + studentList.size());
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

}
