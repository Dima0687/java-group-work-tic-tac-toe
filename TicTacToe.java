import java.util.Scanner;

public class TicTacToe {
  private static char[][] board = { { '-', '-', '-' }, { '-', '-', '-' }, { '-', '-', '-' } };
  private static char currentPlayer = 'X';

  public static void main(String[] args) {

    displayBoard();
    
    while (true) {
      displayBoard(); // refresh the board with new data from the board
      
      /*
      if(checkWinner() || isNoMoreMovesPossible()) { // check if we have a winner or if we have the board full
        break;
      }
      
      */
      
      switchPlayer(); // round is over, switch to the next player
      
    }
    
    /*
     if(checkWinner()) {
        System.out.println("Player " + currentPlayer + " wins!");
     } else {
        System.out.println("It's a draw!");
     }
     */
  }

  private static void displayBoard() {
    System.out.println("  0 1 2");
    for (int i = 0; i < 3; i++) {
      System.out.print(i + " ");
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  private static void switchPlayer() {
    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
  }
}
