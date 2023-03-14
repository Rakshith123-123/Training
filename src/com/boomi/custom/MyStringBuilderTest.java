package com.boomi.custom;

import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnit4ClassRunner.class)
public class MyStringBuilderTest {
    private MyStringBuilder sb;

    @Before
    public void setUp() {
        sb = new MyStringBuilder("hello", "[a-z ]+");
    }

    @Test
    public void testAppend() {
        sb.append(" world");
        assertEquals("hello world", sb.toString());
    }

    @Test
    public void testDelete() {
        sb.delete(4, sb.toString().length());
        assertEquals("hell", sb.toString());
    }

    @Test
    public void testInsert() {
        sb.insert(5, " nan");
        assertEquals("hello nan", sb.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendWithInvalidString() {
        sb.append(" World!");
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteWithInvalidStartIndex() {
        sb.delete(-1, 3);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteWithInvalidEndIndex() {
        sb.delete(0, 10);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteWithInvalidRange() {
        sb.delete(3, 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertWithInvalidOffset() {
        sb.insert(10, " World!");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertWithInvalidString() {
        sb.insert(5, "123");
    }
}
