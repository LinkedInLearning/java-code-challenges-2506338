package com.linkedinlearning.solutions;

public class WordWrapper {
  private int maxWidth;

  public WordWrapper(int maxWidth) {
    this.maxWidth = maxWidth;
  }

  public String wrap(String text) {
    StringBuilder wrappedText = new StringBuilder();
    String[] words = text.split(" ");

    StringBuilder currentLine = new StringBuilder();

    for (String word : words) {
      if (currentLine.length() > 0 && currentLine.length() + word.length() > maxWidth) {
        // Word wrap to next line
        wrappedText.deleteCharAt(wrappedText.length() - 1);
        wrappedText.append("\n");
        currentLine = new StringBuilder();
      }
      wrappedText.append(word);
      wrappedText.append(" ");

      currentLine.append(word);
      currentLine.append(" ");
    }

    return wrappedText.toString().trim();
  }
}
