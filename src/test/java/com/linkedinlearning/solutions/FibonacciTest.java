package com.linkedinlearning.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
  @Test
  void testFibonacci() {
    var expected = 144;
    var actual = Fibonacci.fibonacci(12);
    System.out.println(actual);
    Assertions.assertEquals(expected, actual);
  }
}
