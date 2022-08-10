package com.linkedinlearning.solutions;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {

  public static List<Integer> findPrimeNumbersInInterval(int start, int end) {

    var foundPrimeNumbers = new ArrayList<Integer>();

    for (int i = start; i <= end; i++) {
      if (isPrime(i)) {
        foundPrimeNumbers.add(i);
      }
    }

    return foundPrimeNumbers;
  }

  static private boolean isPrime(int number) {
    if (number < 2) {
      return false;
    }
    for (int i = 2; i < (number / 2) + 1; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

}
