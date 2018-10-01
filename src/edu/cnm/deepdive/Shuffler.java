package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Random;


public class Shuffler {

  public static final int DECK_SIZE = 52;
  private int[] deckThree = new int[DECK_SIZE];
  private Random rng = new Random();

  public static void main(String[] args) {
    Shuffler theShuffler = new Shuffler();
    theShuffler.fillThirdDeck();
    theShuffler.shuffleDeckInPlace(DECK_SIZE - 1);
    theShuffler.printDeckThree();
    int[] deck = new int[DECK_SIZE];
    for (int i = 0; i < deck.length; i++) {
      deck[i] = i+1;
    }
    System.out.println(Arrays.toString(deck));
    shuffle(deck);
    System.out.println(Arrays.toString(deck));
    String[] names = {"heeeellllooo", "hiya", "hola", "howdy", "hi", "guten tag"};
    System.out.println(Arrays.toString(names));
    shuffle(names);
    System.out.println(Arrays.toString(names));
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

  public static <T> void shuffle(T[] deck, Random rng){
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      T temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
  }

  public static <T> void shuffle(T[] deck) {
    shuffle(deck, new Random());
  }


  private void printDeckThree() {
    for (int i = 0; i < DECK_SIZE; i++) {
      System.out.print(" " + deckThree[i]);
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
    int secondPosition = rng.nextInt(position);
    int tempPosVal = deckThree[position];
    deckThree[position] = deckThree[secondPosition];
    deckThree[secondPosition] = tempPosVal;
  }
}
