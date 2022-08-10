package com.linkedinlearning.solutions;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticMeanTest {

  @Test
  void testMean() {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 6, 1, 2, 5, 6);
    var expected = 3.44;

    var mean = ArithmeticMean.mean(numbers);

    Assertions.assertEquals(expected, mean, 0.01);
  }
}
