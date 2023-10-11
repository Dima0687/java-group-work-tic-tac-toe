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
  
private static boolean checkWinner() {

		for (int i = 0; i < 3; i++) {

			// Row
			if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
				return true;
			}
			// Column
			if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
				return true;
			}

			
		}
		
	    if ((board[0][0] == currentPlayer && board [1][1] == currentPlayer && board [2][2] == currentPlayer) ||
	               (currentPlayer == board [2][0] && currentPlayer == board [1][1] && currentPlayer == board [0][2])) {
	               return true;
	           }
	    return false;
	    
	}

}
