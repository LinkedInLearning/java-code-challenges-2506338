package com.linkedinlearning.solutions;

import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {
  public static boolean isHappy(int n) {
    Set<Integer> seen = new HashSet<>();

    int i = n;
    while (i != 1 && !seen.contains(i)) {
      seen.add(i);
      i = sumOfSquares(i);
    }

    return i == 1;

  }

  private static int sumOfSquares(int n) {
    int sum = 0;
    while (n > 0) {
      int digit = n % 10;
      sum += digit * digit;
      n /= 10;
    }
    return sum;
  }
}
