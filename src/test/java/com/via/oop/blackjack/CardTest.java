/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.oop.blackjack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.via.oop.enums.Rank;
import com.via.oop.enums.Suit;

/**
 * 
 * @author via
 * 
 * @date 25 Sep 2023
 *
 */
class CardTest {

    @Test
    void canGetValueOfACard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.TWO);
        assertEquals(2, card1.getValue());
    }

}
