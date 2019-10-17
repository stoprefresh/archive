package com.skilldistillery.advancedarrays.drills;

public class MultiDeclare {
	public static void main(String[] args) {
		// Declare a two-dimensional array of char values to represent a
		// tic-tac-toe board.
		char ticTac[][] = new char[3][3];
		
		printBoard(ticTac);
		
//		for (int i = 0; i < ticTac.length; i++) {
//			char[] row = ticTac[i];
//			for (int j = 0; j < row.length; j++) {
//				System.out.println(ticTac[i][j]);
//			}
//		}
//		
//		boolean gameOn = true;
//		do {
//			
//			
//			
//		}while(gameOn == true);

	}
	
	public static char[][] printBoard(char ticTac[][]) {
		char ticTacBoard[][] = ticTac;
		System.out.println();
		System.out.println("[" + ticTac[0][0] + "] [" + ticTac[0][1] + "] [" + ticTac[0][2] + "]");
		System.out.println("[" + ticTac[1][0] + "] [" + ticTac[1][1] + "] [" + ticTac[1][2] + "]");
		System.out.println("[" + ticTac[2][0] + "] [" + ticTac[2][1] + "] [" + ticTac[2][2] + "]");
		
		return ticTacBoard;
	}

}
