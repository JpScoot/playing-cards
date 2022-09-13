package com.tlglearning.cards.model;

public enum Rank {
  //enumerated values
  ACE("A"),
  TWO("2"),
  THREE("3"),
  FOUR("4"),
  FIVE("5"),
  SIX("6"),
  SEVEN("7"),
  EIGHT("8"),
  NINE("9"),
  TEN("10"),
  JACK("J"),
  QUEEN("Q"),
  KING("K");

  //fields
  private final String symbol;

  //constructor alt + enter
  Rank(String symbol) {
    this.symbol = symbol;
  }

  //accessor method
  public String symbol(){
    return symbol;
  }

  @Override
  public String toString() {
    String name = name();
    return name.charAt(0) + name.substring(1).toLowerCase();
  }

}
