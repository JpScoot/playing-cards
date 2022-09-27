package com.tlglearning.cards.model;

import java.util.Locale;

public enum Suit {
  //enumerated values
  CLUBS('\u2663', Color.BLACK),// Becomes public static final Suit CLUBS = new Suit('\u2663');
  DIAMONDS('\u2662', Color.RED),//constructor invocations
  HEARTS('\u2661', Color.RED),
  SPADES('\u2660', Color.BLACK);

  //fields : attributes of enumerated values
  private final char symbol;
  private final Color color;

  //constructor method
  private Suit(char symbol, Color color) {
    this.symbol = symbol;
    this.color = color;
  }

  //getter and setter accessor methods
  public char symbol() {
    return symbol;
  }

  public Color color(){
    return color;
  }

  //override a method
  @Override
  public String toString() {
    String name = name();
    return name.charAt(0) + name.substring(1).toLowerCase();
  }

  public enum Color {
    BLACK, RED
  }

}
