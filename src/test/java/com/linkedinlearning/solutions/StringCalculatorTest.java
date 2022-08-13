package com.linkedinlearning.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
  @Test
  void testAdd() {
    Assertions.assertEquals(0, StringCalculator.add(""));
    Assertions.assertEquals(1, StringCalculator.add("1"));
    Assertions.assertEquals(15, StringCalculator.add("1,2,3,4,5"));
    
    System.out.println(StringCalculator.add("42,8"));
  }
}
