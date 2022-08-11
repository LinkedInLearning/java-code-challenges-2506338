package com.linkedinlearning.solutions;

public class BubbleSort {

  public static void sort(int[] array) {

    boolean swapped;
    do {
      swapped = false;

      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          var bigger = array[i];
          var smaller = array[i + 1];
          array[i] = smaller;
          array[i + 1] = bigger;
          swapped = true;
        }
      }

    } while (swapped);
  }

}
