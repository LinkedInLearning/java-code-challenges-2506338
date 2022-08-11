package com.linkedinlearning.solutions;

public class GameOfLife {
  private boolean[][] board;

  public GameOfLife(boolean[][] board) {
    this.board = board;
  }

  public void evolve() {
    boolean[][] newBoard = new boolean[board.length][board[0].length];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        newBoard[i][j] = nextCellState(i, j);
      }
    }
    board = newBoard;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        sb.append(board[i][j] ? "*" : ".");
      }
      sb.append("\n");
    }

    return sb.substring(0, sb.length() - 1).toString();
  }

  private boolean nextCellState(int i, int j) {

    boolean isAlive = board[i][j];

    int liveNeighbors = 0;
    for (int x = i - 1; x <= i + 1; x++) {
      for (int y = j - 1; y <= j + 1; y++) {
        if (x == i && y == j) {
          continue;
        }
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
          continue;
        }
        if (board[x][y]) {
          liveNeighbors++;
        }
      }
    }

    if (isAlive && (liveNeighbors == 2 || liveNeighbors == 3)) {
      // Any live cell with two or three live neighbours survives.
      return true;
    } else if (!isAlive && liveNeighbors == 3) {
      // Any dead cell with exactly three live neighbours becomes a live cell, as if
      // by reproduction.
      return true;
    } else {
      return false;
    }

  }

}
