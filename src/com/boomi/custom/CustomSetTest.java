package com.boomi.custom;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import com.boomi.custom.CustomSet;

@RunWith(Parameterized.class)
public class CustomSetTest<T> {

    private CustomSet<T> customSet;
    private List<T> expectedElements;

    public CustomSetTest(List<T> elements, List<T> expectedElements) {
        this.customSet = new CustomSet<>(elements);
        this.expectedElements = expectedElements;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 2, 3, 4)},
                {Arrays.asList("a", "b", "c", "d"), Arrays.asList("a", "b", "c", "d")},
                {Arrays.asList(new Student("Alice", 123), new Student("Bob", 456), new Student("Charlie", 789)),
                        Arrays.asList(new Student("Alice", 123), new Student("Bob", 456), new Student("Charlie", 789))},
        });
    }

    @Before
    public void setUp() {
        customSet = new CustomSet<>();
    }

    @Test
    public void testAdd() {
        for (T element : expectedElements) {
            assertTrue(customSet.add(element));
        }
        assertEquals(expectedElements.size(), customSet.size());
    }

    @Test
    public void testRemove() {
        for (T element : expectedElements) {
            customSet.add(element);
        }
        for (T element : expectedElements) {
            assertTrue(customSet.remove(element));
        }
        assertEquals(0, customSet.size());
    }

    @Test
    public void testContains() {
        for (T element : expectedElements) {
            customSet.add(element);
        }
        for (T element : expectedElements) {
            assertTrue(customSet.contains(element));
        }
    }

    @Test
    public void testGetElements() {
        for (T element : expectedElements) {
            customSet.add(element);
        }
        List<T> elements = customSet.getElements();
        assertEquals(expectedElements.size(), elements.size());
        for (T element : expectedElements) {
            assertTrue(elements.contains(element));
        }
    }

    @Test
    public void testParameterizedConstructor(){
        customSet = new CustomSet<>(expectedElements);
        assertEquals(customSet.size(),expectedElements.size());
    }
}
