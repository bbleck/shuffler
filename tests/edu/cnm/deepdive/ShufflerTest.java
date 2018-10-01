package edu.cnm.deepdive;

import static javafx.scene.input.KeyCode.T;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ShufflerTest {

  @Test
  void main() {
  }

  @Test
  void shuffleByte() {
    byte[] deckOne = {1,2,3,4,5,6,7,8,9,10};
    byte[] deckTwo = Arrays.copyOf(deckOne, deckOne.length);
    Shuffler.shuffle(deckOne);
    assertFalse(Arrays.equals(deckOne, deckTwo));
    Arrays.sort(deckOne);
    Arrays.sort(deckTwo);
    assertArrayEquals(deckOne, deckTwo);
  }

  @Test
  void shuffle1Int() {
    int[] deckOne = {1,2,3,4,5,6,7,8,9,10};
    int[] deckTwo = Arrays.copyOf(deckOne, deckOne.length);
    Shuffler.shuffle(deckOne);
    assertFalse(Arrays.equals(deckOne, deckTwo));
    Arrays.sort(deckOne);
    Arrays.sort(deckTwo);
    assertArrayEquals(deckOne, deckTwo);
  }

  @Test
  void shuffleChar() {
    char[] deckOne = {1,2,3,4,5,6,7,8,9,10};
    char[] deckTwo = Arrays.copyOf(deckOne, deckOne.length);
    Shuffler.shuffle(deckOne);
    assertFalse(Arrays.equals(deckOne, deckTwo));
    Arrays.sort(deckOne);
    Arrays.sort(deckTwo);
    assertArrayEquals(deckOne, deckTwo);
  }

  @Test
  void shuffleLong() {
    long[] deckOne = {1,2,3,4,5,6,7,8,9,10};
    long[] deckTwo = Arrays.copyOf(deckOne, deckOne.length);
    Shuffler.shuffle(deckOne);
    assertFalse(Arrays.equals(deckOne, deckTwo));
    Arrays.sort(deckOne);
    Arrays.sort(deckTwo);
    assertArrayEquals(deckOne, deckTwo);
  }

  @Test
  void shuffleDouble() {
    double[] deckOne = {1,2,3,4,5,6,7,8,9,10};
    double[] deckTwo = Arrays.copyOf(deckOne, deckOne.length);
    Shuffler.shuffle(deckOne);
    assertFalse(Arrays.equals(deckOne, deckTwo));
    Arrays.sort(deckOne);
    Arrays.sort(deckTwo);
    assertArrayEquals(deckOne, deckTwo);
  }

  @Test
  void shuffleFloat() {
    float[] deckOne = {1,2,3,4,5,6,7,8,9,10};
    float[] deckTwo = Arrays.copyOf(deckOne, deckOne.length);
    Shuffler.shuffle(deckOne);
    assertFalse(Arrays.equals(deckOne, deckTwo));
    Arrays.sort(deckOne);
    Arrays.sort(deckTwo);
    assertArrayEquals(deckOne, deckTwo);
  }

  @Test
  void shuffleShort() {
    short[] deckOne = {1,2,3,4,5,6,7,8,9,10};
    short[] deckTwo = Arrays.copyOf(deckOne, deckOne.length);
    Shuffler.shuffle(deckOne);
    assertFalse(Arrays.equals(deckOne, deckTwo));
    Arrays.sort(deckOne);
    Arrays.sort(deckTwo);
    assertArrayEquals(deckOne, deckTwo);
  }

  @Test
  void shuffleGeneric() {
    Integer[] deckOne = {1,2,3,4,5,6,7,8,9,10};
    Integer[] deckTwo = Arrays.copyOf(deckOne, deckOne.length);
    Shuffler.shuffle(deckOne);
    assertFalse(Arrays.equals(deckOne, deckTwo));
    Arrays.sort(deckOne);
    Arrays.sort(deckTwo);
    assertArrayEquals(deckOne, deckTwo);
  }
}