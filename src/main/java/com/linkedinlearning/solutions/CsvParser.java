package com.linkedinlearning.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CsvParser {

  public Map<Integer, String> parse(String fileName) {

    Map<Integer, String> turingAwardWinner = new HashMap<>();

    try (FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);) {
      turingAwardWinner = bufferedReader.lines()
          .map(s -> s.split(","))
          .collect(Collectors.toMap(
              s -> Integer.parseInt(s[0]),
              s -> s[1],
              (winner1, winner2) -> winner1 + ", " + winner2));

    } catch (IOException e) {
      System.out.println("Error reading file '" + fileName + "'");
    }

    return turingAwardWinner;

  }

}
