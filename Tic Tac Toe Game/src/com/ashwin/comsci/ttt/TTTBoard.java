package com.ashwin.comsci.ttt;

public class TTTBoard {

	private String[][] gameState = new String[3][3];

	public TTTBoard() {
		for (int currentRow = 0; currentRow < 3; currentRow++) {
			for (int currentColumn = 0; currentColumn < 3; currentColumn++) {
				gameState[currentRow][currentColumn] = "*";
			}
		}

	}

	public void printGameState() {
		for (int currentRow = 0; currentRow < 3; currentRow++) {
			for (int currentColumn = 0; currentColumn < 3; currentColumn++) {
				System.out.print(gameState[currentRow][currentColumn]);
			}
			System.out.println();
		}

	}

	public String gameResult() {
		String winner = "meep";
		// checks horizontal
		for (int row = 0; row < 3; row++) {
			int col = 0;
			if ((gameState[row][col] == "X") && (gameState[row][col + 1] == "X") && (gameState[row][col + 2] == "X")) {
				winner = "X is the winner!";
				return winner;
			} else if ((gameState[row][col] == "O") && (gameState[row][col + 1] == "O")
					&& (gameState[row][col + 2] == "O")) {
				winner = "O winner";
				return winner;
			} else {
				winner = "unknown";
			}
		}
		// checks verticals
		if (winner == "unknown") {
			for (int c = 0; c < 3; c++) {
				int r = 0;
				if ((gameState[r][c] == "X") && (gameState[r + 1][c] == "X") && (gameState[r + 2][c] == "X")) {
					winner = "X is the winner!";
					return winner;
				} else if ((gameState[r][c] == "O") && (gameState[r + 1][c] == "O") && (gameState[r + 2][c] == "O")) {
					winner = "O is the winner!";
					return winner;
				} else {
					winner = "unknown";
				}
			}
		}
		// checks diagonals
		if (winner == "unknown") {
			if ((gameState[0][0] == "X") && (gameState[1][1] == "X") && (gameState[2][2] == "X")) {
				winner = "X is the winner!";
				return winner;
			} else if ((gameState[2][0] == "X") && (gameState[1][1] == "X") && (gameState[0][2] == "X")) {
				winner = "X is the winner!";
				return winner;
			} else if ((gameState[0][0] == "O") && (gameState[1][1] == "O") && (gameState[2][2] == "O")) {
				winner = "O is the winner!";
				return winner;
			} else if ((gameState[2][0].equals("O")) && (gameState[1][1].equals("O")) && (gameState[0][2].equals("O"))) {
				winner = "O is the winner!";
				return winner;
			} else {
				winner = "unknown";
			}
		}
		// checks for completion
		int blankCount = 0;
		for (int currentRow = 0; currentRow < 3; currentRow++) {
			for (int currentColumn = 0; currentColumn < 3; currentColumn++) {
				if (gameState[currentRow][currentColumn].equals("*")) {
					blankCount++;
				}
			}
		}
		if (blankCount > 3) {
			return "The game is incomplete";
		} else if (blankCount <= 3) {
			winner = "unknown";
		}
		// it has to be a draw!
		if (winner == "unknown") {
			winner = "It's a draw!";
			return winner;
		}
		return "unknown";

	}

	public String[] getPossibleMoves(String player) {
		String[] possMoves = new String[9];
		int count = 0;
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				if (gameState[r][c].equals("*")) {
					possMoves[count] = player;
					count++;
				} else {
					possMoves[count] = "No move";
					count++;
				}
			}
		}
		return possMoves;
	}

	public boolean makeLegalMove(String player, int rowNumber, int columnNumber) {
		if (columnNumber > 2 || rowNumber > 2) {
			return false;
		}
		if (gameState[rowNumber][columnNumber].equals("*")) {
			gameState[rowNumber][columnNumber] = player;
			return true;
		}
		else {
			return false;
		}
	}

}
