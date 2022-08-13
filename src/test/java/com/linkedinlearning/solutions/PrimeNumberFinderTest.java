package com.linkedinlearning.solutions;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumberFinderTest {

  @Test
  void testFindPrimeNumbersInInterval() {

    var foundPrimeNumbers = PrimeNumberFinder.findPrimeNumbersInInterval(1, 10);
    var expectedPrimeNumbers = Arrays.asList(2, 3, 5, 7);
    System.out.println(foundPrimeNumbers);
    Assertions.assertEquals(expectedPrimeNumbers, foundPrimeNumbers);

  }
}
