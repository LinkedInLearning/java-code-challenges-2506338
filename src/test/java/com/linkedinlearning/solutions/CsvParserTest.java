package com.linkedinlearning.solutions;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CsvParserTest {

  @Test
  void testParse() {
    var csvParser = new CsvParser();
    Map<Integer, String> turingAwardWinners = csvParser.parse("src/test/resources/turing.csv");

    System.out.println(turingAwardWinners);
    Assertions.assertEquals("Richard Hamming", turingAwardWinners.get(1968));
    Assertions.assertEquals(
        "Allen Newell, Herbert A. Simon", turingAwardWinners.get(1975));
  }
}
