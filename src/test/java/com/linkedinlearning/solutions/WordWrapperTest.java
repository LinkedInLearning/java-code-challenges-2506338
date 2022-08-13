package com.linkedinlearning.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordWrapperTest {

  @Test
  void testWrap() {
    WordWrapper wordWrapper = new WordWrapper(10);
    String text = "This is a very long sentence that will be wrapped";
    String expected = "This is a\nvery long\nsentence\nthat will\nbe wrapped";
    String actual = wordWrapper.wrap(text);

    Assertions.assertEquals(expected, actual);
    System.out.println(actual);
  }

}
