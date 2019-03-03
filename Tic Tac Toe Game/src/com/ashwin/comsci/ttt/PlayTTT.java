package com.ashwin.comsci.ttt;

import java.util.Scanner;

public class PlayTTT {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		 TTTBoard gameBoard = new TTTBoard();
		 for(int counter = 0; counter < 9; counter++) {
			 String player;
			 if(counter % 2 == 0) {
				 player = "X";
			 }
			 else {
				 player = "O";
			 }
			 System.out.println("It's " + player + "'s turn!");
			 System.out.print("Enter the row number of your desired move: ");
			 int rowN = kboard.nextInt() -1;
			 System.out.print("Enter the column number of your desired move: ");
			 int colN = kboard.nextInt() - 1;
			 while(gameBoard.makeLegalMove(player, rowN, colN) == false) {
				 System.out.println("You must enter a legal move.");
				 System.out.print("Enter the row number of a different move: ");
				 rowN = kboard.nextInt() - 1;
				 System.out.print("Enter the column number of a different move: ");
				 colN = kboard.nextInt() - 1;
			 }
			 gameBoard.printGameState();
			 
			 String result = gameBoard.gameResult();
			 System.out.println(result);
			 if (!result.equals(TTTBoard.THE_GAME_IS_INCOMPLETE)) {
				 break;
			 }
		 }
		 kboard.close();
	}
}
