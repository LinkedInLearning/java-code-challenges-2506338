package com.linkedinlearning.solutions;

public class StringCalculator {
  
  public static int add(String numbers) {
    if (numbers.isEmpty()) {
      return 0;
    } else {
      String[] split = numbers.split(",");
      int sum = 0;
      for (String number : split) {
        sum += Integer.parseInt(number);
      }
      return sum;
    }
  }

}
