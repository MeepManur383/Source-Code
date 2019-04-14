package com.ashwin.comsci.uno;

public class UnoTest {
	public static void main(String[] args) {
		UnoDeck deck = new UnoDeck();
//		System.out.println(deck);
		deck.shuffleDeck();
//		System.out.println(deck);
//		System.out.println(deck.dealCard());
		UnoGame game = new UnoGame(4);
		game.dealHand();
	}
}
