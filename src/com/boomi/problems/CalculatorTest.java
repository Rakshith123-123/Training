package com.boomi.problems;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest {

    private double num1;
    private double num2;
    private double expected;
    private Calculator calculator;

    public CalculatorTest(double num1, double num2, double expected) {
        this.num1 = num1;
        this.num2 = num2;
        this.expected = expected;
    }

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { { 2, 3, 5 }, { 5, 2, 7 }, { 6, -3, 3 }, { 0, 8, 8 }, { -5, -2, -7  }, {1, 0, 1 } });
    }

    @Test
    public void testAdd() {
        assertEquals(expected, calculator.add(num1, num2), 0);
    }

    @Test
    public void testSubtract() {
        assertEquals(expected, calculator.subtract(num1, -num2), 0);
    }

    @Test
    public void testMultiply() {
        assertEquals(expected, calculator.multiply(num1, num2), 0);
    }

    @Test
    public void testDivide() {
        assertEquals(expected, calculator.divide(num1, num2), 0);
    }

}

