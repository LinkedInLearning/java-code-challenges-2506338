package com.linkedinlearning.solutions;

public class PalindromeChecker {

  public static boolean isPalindrome(String word) {
    var reversedWord = new StringBuilder(word).reverse().toString();
    return word.equals(reversedWord);
  }

}
