package com.ashwin.comsci.ttt;


public class CompletionCheck {
	public static void main(String[] args) {
		String[][] gameState = new String[3][3];
		for (int currentRow = 0; currentRow < 3; currentRow++) {
			for (int currentColumn = 0; currentColumn < 3; currentColumn++) {
				int randomFiller = (int) (Math.random() * 3);
				if (randomFiller == 0) {
					gameState[currentRow][currentColumn] = "*";
				}
				if (randomFiller == 1) {
					gameState[currentRow][currentColumn] = "X";
				} else if (randomFiller == 2) {
					gameState[currentRow][currentColumn] = "O";
				}
			}
		}
		System.out.println(complete(gameState));
	}

	public static String complete(String[][] sheep) {
		int blankCount = 0;
		for (int currentRow = 0; currentRow < 3; currentRow++) {
			for (int currentColumn = 0; currentColumn < 3; currentColumn++) {
				if (sheep[currentRow][currentColumn] == "*") {
					blankCount++;
				}
			}
		}
		if (blankCount > 3) {
			return "The game is incomplete";
		}
		else {
			return "unknown";
		}

	}
}
