/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.section7.guessinggame;

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
class GuessingGameTest {

    private GuessingGame game;

    @BeforeEach
    public void setUp() {
        game = new GuessingGame();
    }

    @Test
    void testSimpleWinSituation() {
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum);
        assertEquals("You win!", message);
    }

    @Test
    void testOneWrongPosGuessSituation() {
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum + 1);
        assertEquals("You lost!", message);
    }

    @Test
    void testOneWrongNegGuessSituation() {
        int randomNum = game.getRandomNumber();
        String message = game.guess(-5);
        assertEquals("You lost!", message);
    }

    @Test
    // @RepeatedTest(5)
    void testRandomNumberGeneration() {
        // 1 2 3 4 5 6 7 8 9 10
        // 1 1 1 1 0 1 0 1 1 1 = 10
        int[] rndNumCount = new int[11];
        for (int counter = 0; counter < 100; counter++) {
            GuessingGame game = new GuessingGame();
            int randomNum = game.getRandomNumber();
            rndNumCount[randomNum] = 1;
        }

        int sum = 0;
        for (int counter = 0; counter < 11; counter++) {
            sum = sum + rndNumCount[counter];
        }

        assertEquals(10, sum);
    }
}
