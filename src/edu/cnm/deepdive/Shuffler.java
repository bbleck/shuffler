package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Random;

public class Shuffler {

  public static final int DECK_SIZE = 52;
  private ArrayList<Integer> deckOne = new ArrayList<Integer>(DECK_SIZE);
  private int[] deckThree = new int[DECK_SIZE];
  private ArrayList<Integer> deckTwo = new ArrayList<Integer>(0);

  public static void main(String[] args) {
    Shuffler theShuffler = new Shuffler();
    theShuffler.fillThirdDeck();
    theShuffler.shuffleDeckInPlace(DECK_SIZE - 1);
    theShuffler.printDeckThree();
//    theShuffler.setUp();
//    theShuffler.printDecks();
//    theShuffler.shuffleDeck();
//    theShuffler.printDecks();
  }


  private void fillThirdDeck() {
    for (int i = 0; i < DECK_SIZE; i++) {
      deckThree[i] = i + 1;
    }
  }

  public static void shuffle(byte[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      byte temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
  }

  public static void shuffle(byte[] deck) {
    shuffle(deck, new Random());
  }

  public static void shuffle(int[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      int temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
  }

  public static void shuffle(int[] deck) {
    shuffle(deck, new Random());
  }

  public static void shuffle(char[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      char temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
  }

  public static void shuffle(char[] deck) {
    shuffle(deck, new Random());
  }

  public static void shuffle(float[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      float temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
  }

  public static void shuffle(float[] deck) {
    shuffle(deck, new Random());
  }

  public static void shuffle(double[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      double temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
  }

  public static void shuffle(double[] deck) {
    shuffle(deck, new Random());
  }

  public static void shuffle(short[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      short temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
  }

  public static void shuffle(short[] deck) {
    shuffle(deck, new Random());
  }

  public static void shuffle(long[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      long temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
  }

  public static void shuffle(long[] deck) {
    shuffle(deck, new Random());
  }

  private void printDeckThree() {
    for (int i = 0; i < DECK_SIZE; i++) {
      System.out.print(" " + deckThree[i]);
    }
  }

  private void fillOneDeck() {
    for (int i = 0; i < DECK_SIZE; i++) {
      deckOne.set(i, i + 1);
    }
  }

  private void shuffleDeckInPlace(int position) {
    if (position > 1) {
      swap(position);
      position--;
      shuffleDeckInPlace(position);
    } else {

    }
  }

  private void swap(int position) {
    Random rng = new Random();
    int secondPosition = rng.nextInt(position);
//    System.out.println(position);
//    System.out.println(secondPosition);
    int tempPosVal = deckThree[position];
    deckThree[position] = deckThree[secondPosition];
    deckThree[secondPosition] = tempPosVal;
//    deckOne.set(position, secondPosition+1);
//    deckOne.set(secondPosition, position+1);
  }

  private void printDecks() {
    System.out.println();
    System.out.println("Deck 1:");
    for (int i = 0; i < deckOne.size(); i++) {
      System.out.println(deckOne.get(i).toString());
    }
    System.out.println("Deck 2:");
    for (int i = 0; i < deckTwo.size(); i++) {
      System.out.println(deckTwo.get(i).toString());
    }
  }

  private void setUp() {
    for (int i = 0; i < 52; i++) {
      deckOne.add(i + 1);
//      System.out.println(i+1);
    }
  }

  void shuffleDeck() {
    Random rng = new Random();
    int card = rng.nextInt() * deckOne.size();
    if (deckOne.size() > 0) {
      deckTwo.add(deckOne.remove(card));
      shuffleDeck();
    } else {
      return;
    }
  }
}
