package com.ashwin.comsci.ttt;

public class tttGame {
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
		printGameState(gameState);
		String winner = gameResult(gameState);
		System.out.println(winner);
	}

	public static void printGameState(String[][] printMe) {
		for (int currentRow = 0; currentRow < 3; currentRow++) {
			for (int currentColumn = 0; currentColumn < 3; currentColumn++) {
				System.out.print(printMe[currentRow][currentColumn]);
			}
			System.out.println();
		}

	}

	public static String gameResult(String[][] currentState) {
		String winner = "meep";
		// checks horizontal
		for (int row = 0; row < 3; row++) {
			int col = 0;
			if ((currentState[row][col] == "X") && (currentState[row][col + 1] == "X")
					&& (currentState[row][col + 2] == "X")) {
				winner = "X is the winner!";
				return winner;
			} else if ((currentState[row][col] == "O") && (currentState[row][col + 1] == "O")
					&& (currentState[row][col + 2] == "O")) {
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
				if ((currentState[r][c] == "X") && (currentState[r + 1][c] == "X") && (currentState[r + 2][c] == "X")) {
					winner = "X is the winner!";
					return winner;
				} else if ((currentState[r][c] == "O") && (currentState[r + 1][c] == "O")
						&& (currentState[r + 2][c] == "O")) {
					winner = "O is the winner!";
					return winner;
				} else {
					winner = "unknown";
				}
			}
		}
		// checks diagonals
		if (winner == "unknown") {
			if ((currentState[0][0] == "X") && (currentState[1][1] == "X") && (currentState[2][2] == "X")) {
				winner = "X is the winner!";
				return winner;
			} else if ((currentState[2][0] == "X") && (currentState[1][1] == "X") && (currentState[0][2] == "X")) {
				winner = "X is the winner!";
				return winner;
			} else if ((currentState[0][0] == "O") && (currentState[1][1] == "O") && (currentState[2][2] == "O")) {
				winner = "O is the winner!";
				return winner;
			} else if ((currentState[2][0] == "O") && (currentState[1][1] == "O") && (currentState[0][2] == "O")) {
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
				if (currentState[currentRow][currentColumn] == "*") {
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
	public String[] getPossibleMoves(String player, String[][] currentState){
		String[] possMoves = new String[9];
		int count = 0;
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if (currentState[r][c] == "*") {
					possMoves[count] = player;
					count++;
				}
				else {
					possMoves[count] = "No move";
					count++;
				}
			}
		}
		return possMoves;
	}
	public static void printPossMoves(String[] moveList) {
		for(int i = 0; i < moveList.length; i++) {
			System.out.println(moveList[i]);
		}

	}


}
