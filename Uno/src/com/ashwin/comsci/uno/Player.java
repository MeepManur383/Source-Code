package com.ashwin.comsci.uno;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	
	private ArrayList<UnoCard> hand = new ArrayList(7);
	private String password;
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	public void addCard(UnoCard card) {
		hand.add(card);
	}
	
	@Override
	public String toString() {
		return (name + ": " + hand.toString());
	}
	
}
