package com.tlglearning.cards.model;

import java.util.Objects;

public class Card implements Comparable<Card> {

  //field
  private final Rank rank;
  private final Suit suit;

  //constructor method initialized final field
  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  //accessor method
  public Rank rank() {
    return rank;
  }

  public Suit suit() {
    return suit;
  }

  @Override
  public int hashCode() {
    return Objects.hash(rank, suit); // FIXME: 9/16/2022 Move this to initialization.
  }

  @Override
  public boolean equals(Object obj) {
    boolean result;
    if (this == obj) {
      result = true;
    } else if (obj instanceof Card) {
      Card other = (Card) obj;
      result = (this.rank == other.rank && this.suit == other.suit);
    } else {
      result = false;
    }
    return result;
  }

  //override objects and behaviors that we inherited from super class
  @Override
  public String toString() {
    return rank.symbol() + suit.symbol();
  }

  @Override
  public int compareTo(Card other) {
    return 0; // TODO: 9/16/2022 Replace with comparison based on suit and rank. 
  }
  
}
