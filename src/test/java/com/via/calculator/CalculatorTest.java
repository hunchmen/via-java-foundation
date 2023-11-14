/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author via
 * 
 * @date 14 Nov 2023
 *
 */
public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();
    }

    @Test
    void canAddZeroPlusZero() {
        int actual = calc.add(0, 0);
        assertEquals(0, actual);
    }

    @Test
    void canAddZeroPlusOne() {
        int actual = calc.add(0, 1);
        assertEquals(1, actual);
    }

    @Test
    void canAddPositiveNumbers() {
        int actual = calc.add(2, 3);
        assertEquals(5, actual);
    }

    @Test
    void canAddNegativeNumbers() {
        int actual = calc.add(-2, -3);
        assertEquals(-5, actual);
    }

    @Test
    void canAddBoundaryIntegers() {
        int actual = calc.add(Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertEquals(-1, actual);
    }

    @Test
    void testAddNullValues() {
        Integer num1 = 2;
        Integer num2 = null;
        assertThrows(NullPointerException.class, () -> {
            calc.add(num1, num2);
        });
    }
}
