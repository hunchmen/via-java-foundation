/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.oop.blackjack;

import com.via.oop.enums.Rank;
import com.via.oop.enums.Suit;

/**
 * 
 * @author via
 * 
 * @date 25 Sep 2023
 *
 */
public class Card {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public static void main(String[] args) {


    }

    /**
     * 
     * @return
     */
    public Integer getValue() {

        return 2;
    }

}
