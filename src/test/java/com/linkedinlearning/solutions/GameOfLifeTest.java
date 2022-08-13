package com.linkedinlearning.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameOfLifeTest {
    @Test
    void singleCellDies() {
        boolean[][] board = new boolean[][] {
                { false, false, false },
                { false, true, false },
                { false, false, false }
        };
        GameOfLife game = new GameOfLife(board);
        game.evolve();
        Assertions.assertEquals("""
                ...
                ...
                ...""", game.toString());
    }

    @Test
    void blinkerOscillates() {

        boolean[][] board = new boolean[][] {
                { false, false, false, false, false },
                { false, false, false, false, false },
                { false, true, true, true, false },
                { false, false, false, false, false },
                { false, false, false, false, false }
        };
        GameOfLife game = new GameOfLife(board);

        Assertions.assertEquals("""
                .....
                .....
                .***.
                .....
                .....""", game.toString());

        game.evolve();
        Assertions.assertEquals("""
                .....
                ..*..
                ..*..
                ..*..
                .....""", game.toString());

        game.evolve();
        Assertions.assertEquals("""
                .....
                .....
                .***.
                .....
                .....""", game.toString());

    }

}
