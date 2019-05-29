package APCSA.project;

import java.awt.Color;
import java.awt.Graphics;
public class Brick {
	private Color color;
	private int strength;
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	
	public Brick(Color color, int strength, int xPos, int yPos, int width, int height) {
		this.color = color;
		this.strength = strength;
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
	}
	public draw(Graphics g) {
		g.fillRect(xPos, yPos, width, height);
	}


	
}
