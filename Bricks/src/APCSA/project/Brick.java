package APCSA.project;

import java.awt.Color;
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
	public String[][] getOccPts() {
		String[][] points = new String[width][height];
		for(int r = 0; r < width; r++) {
			for(int c = 0; c < height; c++) {
				points[r][c] = "" + (xPos + r) + "," + (yPos + c);
			}
		}
		return points;
	}

	
}
