package com.tlglearning.cards.model;

public class Card {

  //field
  private final Rank rank;
  private final Suit suit;

  //constructor method initialized final field
  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  //accessor method
  public Rank rank(){
    return rank;
  }

  public Suit suit(){
    return suit;
  }

  //override objects and behaviors that we inherited from super class
  @Override
  public String toString() {
    return rank.symbol() + suit.symbol();
  }
  // TODO: 9/13/2022 Override equals method. 
  // TODO: 9/13/2022 Override hashCode method. 
}
