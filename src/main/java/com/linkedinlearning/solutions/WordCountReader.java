package com.linkedinlearning.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountReader {
  private int words;
  private int characters;
  private int charactersExcludingSpaces;

  public void readFile(String fileName) {
    words = 0;
    characters = 0;
    charactersExcludingSpaces = 0;

    try (FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);) {

      String line;
      while ((line = bufferedReader.readLine()) != null) {
        processLine(line);
      }

    } catch (IOException ex) {
      System.out.println("Error reading file '" + fileName + "'");
    }
  }

  private void processLine(String line) {
    characters += line.length();
    charactersExcludingSpaces += line.chars().filter(ch -> ch != ' ').count();

    words += line.split(" ").length;

  }

  public int getWords() {
    return words;
  }

  public int getCharacters() {
    return characters;
  }

  public int getCharactersExcludingSpaces() {
    return charactersExcludingSpaces;
  }

}
