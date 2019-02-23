package com.ashwin.comsci.ttt;

import java.util.Arrays;

public class PlayTTT {
	public static void main(String[] args) {
		 TTTBoard gameBoard = new TTTBoard();
		 gameBoard.printGameState();
		 
		 System.out.println(Arrays.toString(gameBoard.getPossibleMoves("X")));
		 
		 gameBoard.makeLegalMove("X", 2, 1);
		 gameBoard.printGameState();
		 
		 System.out.println(Arrays.toString(gameBoard.getPossibleMoves("X")));
		 
		 gameBoard.makeLegalMove("O", 2, 1);
		 gameBoard.printGameState();
		 System.out.println(gameBoard.gameResult());
	}
}
