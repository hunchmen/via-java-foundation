/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    private Calculator calc = null;

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

}
