package com.tlglearning.cards;

import com.tlglearning.cards.model.Deck;
import com.tlglearning.cards.strategy.ColorFirst;
import java.security.SecureRandom;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Deck deck = new Deck(); // create an instance of Deck
    System.out.println(deck); // print deck.

    Random rng = new SecureRandom();  // create an acceptable source of randomness.
    deck.Shuffle(rng); //  shuffle the deck, using the created source of randomness
    System.out.println(deck); // print the string representation of the deck after shuffling.
    deck.sort();
    System.out.println(deck);
    deck.sort(new ColorFirst());
    System.out.println(deck);
  }

}
