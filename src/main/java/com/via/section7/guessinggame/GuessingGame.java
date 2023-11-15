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

    private int counter = 0;

    /**
     * 
     * @param guessedNumber
     * @return
     */
    public String guess(int guessedNumber) {

        counter++;
        if (counter == 4 && guessedNumber != getRandomNumber()) {
            return "You didn't get it and you've had four tries. Game over!!!";
        }

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
