package com.linkedinlearning.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiamondTest {
  @Test
  void aDiamond() {
    var aDiamond = new Diamond('A').renderDiamond();
    var expectedADiamond = """
        A""";
    Assertions.assertEquals(expectedADiamond, aDiamond);
  }

  @Test
  void dDiamond() {

    var dDiamond = new Diamond('D').renderDiamond();
    var expectedDDiamond = """
           A  \s
          B B \s
         C   C\s
        D     D
         C   C\s
          B B \s
           A  \s""";
    Assertions.assertEquals(expectedDDiamond, dDiamond);
    System.out.println(dDiamond);
  }

}
