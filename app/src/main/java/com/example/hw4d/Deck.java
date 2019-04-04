package com.example.hw4d;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Deck.java
 *
 * @author Ben Pirkl
 * @author Geryl Vinoya
 * @author Kama Simon
 * @author Hera Malik
 *
 * @version February 2019
 *
 */
public class Deck implements Serializable {
    private static int SUITDECKSIZE = 13;
    private static int DECKSIZE = 52;
    /* Holds Deck of Cards */
    private ArrayList<Card> presidentDeck;

    /**
     * Deck Constructor
     * Creates Deck to play with
     * Adds information to each card such as
     * SUIT AND CARD VALUE
     */
    public Deck(){
        presidentDeck = new ArrayList<>();
        String suit = "Default";
        for(int i = 0; i < 4; i++){
            if(i == 0){
                suit = "Hearts";
            }
            else if(i == 1){
                suit = "Clubs";
            }
            else if(i == 2){
                suit = "Spades";
            }
            else if(i == 3){
                suit = "Diamonds";
            }
            for(int j = 1; j < SUITDECKSIZE + 1; j++){
                Card card = new Card(j, suit);
                presidentDeck.add(card);
            }
        }
        Collections.shuffle(presidentDeck);
    }



    public ArrayList<Card> getDeck() { return presidentDeck; }

    public int size() { return presidentDeck.size(); }

    public Card remove(int index) {
        return presidentDeck.remove(index);
    }

}

