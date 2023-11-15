/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.section7.guessinggame;

import java.util.Random;

/**
 * 
 * @author via
 * 
 * @date 14 Nov 2023
 *
 */
public class GuessingGame {

    private Random random = new Random();
    private final int randomNumber = random.nextInt(10) + 1;

    /**
     * 
     * @param guessedNumber
     * @return
     */
    public String guess(int guessedNumber) {
        return guessedNumber == getRandomNumber() ? "You win!" : "You lost!";
    }

    /**
     * 
     * @return
     */
    public int getRandomNumber() {
        return randomNumber;
    }

}
