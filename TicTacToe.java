import java.util.Scanner;

public class TicTacToe {
  private static char[][] board = {
      { '-', '-', '-' },
      { '-', '-', '-' },
      { '-', '-', '-' }
    };
    private static char currentPlayer = 'X';
  
  public static void main(String[] args) {
    
    while(true) {
      
    }
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
}
