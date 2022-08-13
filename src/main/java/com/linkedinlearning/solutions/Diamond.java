package com.linkedinlearning.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Diamond {
  private static final char START_LETTER = 'A';
  private char letter;

  public Diamond(char letter) {
    this.letter = letter;
  }

  public String renderDiamond() {

    List<String> diamondRows = createRowsTillMiddle();
    List<String> mirroredRows = mirrorRows(diamondRows);

    diamondRows.addAll(mirroredRows);

    return String.join("\n", diamondRows);

  }

  private List<String> createRowsTillMiddle() {
    var rows = new ArrayList<String>();

    int numberOfLetters = letter - START_LETTER;

    for (int letterIndex = 0; letterIndex <= numberOfLetters; letterIndex++) {
      rows.add(createRow(letterIndex));
    }

    return rows;
  }

  private String createRow(int letterIndex) {
    char currentLetter = (char) (START_LETTER + letterIndex);

    int paddingSize = this.letter - currentLetter;
    int insidePaddingSize = Math.max(letterIndex * 2 - 1, 0);
    String outerPadding = " ".repeat(paddingSize);
    String innerPadding = " ".repeat(insidePaddingSize);

    String row = outerPadding + currentLetter + innerPadding;
    if (letterIndex > 0) {
      row += currentLetter;
    }
    row += outerPadding;

    return row;
  }

  private List<String> mirrorRows(List<String> rows) {
    var mirroredRows = new ArrayList<String>(rows);
    Collections.reverse(mirroredRows);
    mirroredRows.remove(0);
    return mirroredRows;
  }

}
