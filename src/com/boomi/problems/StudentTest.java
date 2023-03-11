package com.boomi.problems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StudentTest {
    private String name;
    private int age;
    private String grade;
    private int percentage;
    private boolean expectedResult;

    public StudentTest(String name, int age, String grade, int percentage, boolean expectedResult) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.percentage = percentage;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Alice", 22, "12th", 85, true},
                {"Bob", 20, "10th", 65, false},
                {"Adam", 18, "9th", 80, true},
                {"Amy", 19, "11th", 90, true}
        });
    }

    @Test
    public void testHasPassed() {
        Student student = new Student(name, age, grade, percentage);
        assertEquals(expectedResult, student.hasPassed());
    }
}
