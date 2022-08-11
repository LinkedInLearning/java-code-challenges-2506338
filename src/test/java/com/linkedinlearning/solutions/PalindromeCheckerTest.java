package com.linkedinlearning.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {
  @Test
  void testIsPalindrome() {
    Assertions.assertTrue(PalindromeChecker.isPalindrome("racecar"));
    Assertions.assertTrue(PalindromeChecker.isPalindrome("radar"));
    Assertions.assertTrue(PalindromeChecker.isPalindrome("a"));
    Assertions.assertTrue(PalindromeChecker.isPalindrome("live on time,emit no evil"));

    Assertions.assertFalse(PalindromeChecker.isPalindrome("abc"));
    Assertions.assertFalse(PalindromeChecker.isPalindrome("abcc"));
  }
}
