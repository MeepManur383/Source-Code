package APCSA.project;

import java.awt.Color;
import java.awt.Graphics;

public class Brick {
	private int strength;
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int value;
	private boolean intact = true;
	private Color color;
	enum BrickSide{LEFT, RIGHT, TOP, BOTTOM, NONE}

	public Brick(int strength, int xPos, int yPos, int width, int height, int value, Color color) {
		this.strength = strength;
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		this.value = value;
		this.color = color;
	}

	public void draw(Color oldColor, Graphics g) {
		if (!intact) {
			g.setColor(oldColor);
			g.fillRect(xPos, yPos, width, height);
		}
		else {
			g.setColor(color);
			g.fillRect(xPos, yPos, width, height);
		}
	}

	public BrickSide brickContact(int ballX, int ballY) {

		if(!intact) {
			return BrickSide.NONE;
		}
		if(ballX < xPos || ballX > xPos + width) {
			return BrickSide.NONE;
		}
		
		if(ballY < yPos || ballY > yPos + height) {
			return BrickSide.NONE;
		}
		
		int xDist = 0;
		int yDist = 0;
		if(xPos <= ballX && ballX <= xPos + width / 2) {
			xDist = Math.abs(ballX - xPos);
		}
		else {
			xDist = ballX - (xPos + width);
		}
		if(yPos <= ballY && ballY <= yPos + height / 2) {
			yDist = Math.abs(ballY - yPos);
		}
		else {
			yDist = ballY - (yPos + height);
		}

		if(xDist >= 0 && xDist < yDist) {
			return BrickSide.LEFT;
		}
		if(xDist < 0 && xDist > yDist) {
			return BrickSide.RIGHT;
		}
		if(yDist >= 0 && yDist < xDist) {
			return BrickSide.TOP;
		}
		else {
			return BrickSide.BOTTOM;
		}
	}

	
	public boolean getState() {
		return intact;
	}

	public void hitBrick() {
		strength--;
		if(strength <= 0) {
			intact = false;
		}
	}

	public int getValue() {
		return value;
	}

	public int getXPos() {
		return xPos;
	}

	public int getYPos() {
		return yPos;
	}

	public int getStrength() {
		return strength;
	}

}