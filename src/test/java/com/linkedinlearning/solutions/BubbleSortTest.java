package com.linkedinlearning.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
  @Test
  void sortedArrayDoesNotChange() {
    var array = new int[] { 1, 2, 3, 4, 5 };
    BubbleSort.sort(array);
    Assertions.assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, array);
  }

  @Test
  void sortingMixedArray() {
    var array = new int[] { 5, 1, 4, 2, 8 };
    BubbleSort.sort(array);
    Assertions.assertArrayEquals(new int[] { 1, 2, 4, 5, 8 }, array);
  }
}
ö