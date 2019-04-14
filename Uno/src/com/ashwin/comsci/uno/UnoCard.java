package com.ashwin.comsci.uno;

public class UnoCard {
	
	enum Color{RED, YELLOW, GREEN, BLUE, BLACK}
	enum Special{NONE, DRAW2, SKIP, REVERSE, WILD, DRAW4}
		
	private Color color;
	private int value;
	private Special special;
	
	public UnoCard(Color color, int value, Special special) {
		this.color = color;
		this.value = value;
		this.special = special;
	}
	
	@Override
	public String toString() {
		return ("|" + color + ", " + value + ", " + special + "|");
	}
}
