package com.tlglearning.cards.model;

import java.util.Locale;

public enum Suit {
  //enumerated values
  CLUBS('\u2663'),// Becomes public static final Suit CLUBS = new Suit('\u2663');
  DIAMONDS('\u2662'),//constructor invocations
  HEARTS('\u2661'),
  SPADES('\u2660');

  //fields : attributes of enumerated values
  private final char symbol;

  //constructor method
  private Suit(char symbol) {
    this.symbol = symbol;
  }

  //getter and setter accessor methods
  public char symbol() {
    return symbol;
  }

  //override a method
  @Override
  public String toString() {
    String name = name();
    return name.charAt(0) + name.substring(1).toLowerCase();
  }


}
