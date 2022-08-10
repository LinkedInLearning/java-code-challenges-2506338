package com.linkedinlearning.solutions;

import java.util.Collection;

public class ArithmeticMean {

  public static double mean(Collection<Integer> numbers) {

    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return (double) sum / numbers.size();

    // return numbers.stream()
    // .mapToInt(Integer::intValue)
    // .average()
    // .orElse(0.0);

  }

}
