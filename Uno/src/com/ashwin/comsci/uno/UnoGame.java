package com.ashwin.comsci.uno;
import java.util.ArrayList;

public class UnoGame {
	private int pNum;
	private UnoDeck gameDeck = new UnoDeck();
	Player[] players = new Player[pNum];
	private Player currentPlayer;
	private int direction;
	private boolean gameOver;

	

	public UnoGame(int pNum) {
		this.pNum = pNum;
		Player[] players = new Player[pNum];
		this.players = players;
		for(int i = 0; i < pNum; i++) {
			players[i] = new Player(("Player") + (i + 1));
		}
	}
	
	public void dealHand() {
		gameDeck.shuffleDeck();
		for(int i = 0; i < 7; i++){
			for(int p = 0; p < pNum; p++) {
				players[p].addCard(gameDeck.dealCard());
			}
		}
		System.out.println(players[0]);
	}
	
	public void whoseTurn() {
		direction = 1;
		if(direction != -1) {
			int i = 0;
			while(!gameOver) {
				currentPlayer = players[i];
				if(i == pNum - 1) {
					i = 0;
				}
				else
					i++;
			}
		}
	}
	
	
		
	
}
