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

    private static final int NUMBER_OF_TRIES = 100;

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
        String message = game.guess(-5);
        assertEquals("You lost!", message);
    }

    @Test
    // @RepeatedTest(5)
    void testRandomNumberGeneration() {
        // 1 2 3 4 5 6 7 8 9 10
        // 1 1 1 1 0 1 0 1 1 1 = 10
        int[] rndNumCount = new int[11];
        for (int counter = 0; counter < NUMBER_OF_TRIES; counter++) {
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

    @Test
    void testFourWrongGuesses() {
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        String message = game.guess(-3);
        assertEquals("You didn't get it and you've had four tries. Game over!!!", message);
    }

    @Test
    void testThreeWrongAndOneCorrectGuesses() {
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        int correctGuess = game.getRandomNumber();
        String message = game.guess(correctGuess);
        assertEquals("You win!", message);
    }
}
