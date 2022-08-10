package com.linkedinlearning.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
  @Test
  void testFibonacci() {
    var expected = 144;
    var actual = Fibonacci.fibonacci(12);

    Assertions.assertEquals(expected, actual);
  }
}
