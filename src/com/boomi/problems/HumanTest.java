package com.boomi.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {
    @Test
    public void testConstructorAndGetters() {
        Human human = new Human("Alice", 22);
        assertEquals("Alice", human.getName());
        assertEquals(22, human.getAge());
    }
}

