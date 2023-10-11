import java.util.Scanner;

public class TicTacToe {
  public static void main(String[] args) {
    
    while(true) {
      
    }
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
