package com.ashwin.comsci.uno;

import java.util.Arrays;

import com.ashwin.comsci.uno.UnoCard.Color;
import com.ashwin.comsci.uno.UnoCard.Special;

public class UnoDeck {
	// there are 108 cards in an uno deck
	// red green yellow blue
	// each with one zero, two of each after
	// each have two reverses draw twos and skips
	// four wilds and four drawfours

	public UnoCard[] deck = new UnoCard[108];
	private int topCard;

	public UnoDeck() {
		int sVal = createColorCards(Color.RED, 0);
		sVal = createColorCards(Color.YELLOW, sVal);
		sVal = createColorCards(Color.GREEN, sVal);
		sVal = createColorCards(Color.BLUE, sVal);
		sVal = createSpecialCards(Color.RED, Special.DRAW2, sVal);
		sVal = createSpecialCards(Color.RED, Special.SKIP, sVal);
		sVal = createSpecialCards(Color.RED, Special.REVERSE, sVal);
		sVal = createSpecialCards(Color.YELLOW, Special.DRAW2, sVal);
		sVal = createSpecialCards(Color.YELLOW, Special.SKIP, sVal);
		sVal = createSpecialCards(Color.YELLOW, Special.REVERSE, sVal);
		sVal = createSpecialCards(Color.GREEN, Special.DRAW2, sVal);
		sVal = createSpecialCards(Color.GREEN, Special.SKIP, sVal);
		sVal = createSpecialCards(Color.GREEN, Special.REVERSE, sVal);
		sVal = createSpecialCards(Color.BLUE, Special.DRAW2, sVal);
		sVal = createSpecialCards(Color.BLUE, Special.SKIP, sVal);
		sVal = createSpecialCards(Color.BLUE, Special.REVERSE, sVal);
		sVal = createWildCards(Special.WILD, sVal);
		createDraw4Cards(Special.DRAW4, sVal);

	}

	private int createColorCards(Color color, int start) {
		deck[start] = new UnoCard(color, 0, Special.NONE);
		for (int j = 0; j < 2; j++) {
			for (int v = 1; v <= 9; v++) {
				deck[++start] = new UnoCard(color, v, Special.NONE);
			}
		}
		return start + 1;
	}

	private int createSpecialCards(Color color, Special move, int start) {
		deck[start] = new UnoCard(color, -1, move);
		deck[++start] = new UnoCard(color, -1, move);
		return start + 1;
	}

	private int createWildCards(Special move, int start) {
		for (int i = start; i < start + 4; i++) {
			deck[i] = new UnoCard(Color.BLACK, -2, move);
		}
		start += 4;
		return start;
	}

	private void createDraw4Cards(Special move, int start) {
		for (int i = start; i < start + 4; i++) {
			deck[i] = new UnoCard(Color.BLACK, -2, move);
		}
	}

	public void shuffleDeck() {
		for (int s = 0; s < 1000; s++) {
			int tempInd = (int) (Math.random() * 108);
			int shuffleMe = (int) (Math.random() * 108);
			UnoCard temp = deck[tempInd];
			deck[tempInd] = deck[shuffleMe];
			deck[shuffleMe] = temp;
		}
		topCard = 0;

	}

	public UnoCard dealCard() {		
		return deck[topCard++];
	}

	@Override
	public String toString() {
		return Arrays.toString(deck);
	}

}
