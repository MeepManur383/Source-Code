package APCSA.project;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle{
	private int width;
	private int height;
	private int x;
	private int y;
	private int startX;
	private int oldX;
	private int paddleVel = 5;
	private int hitCount = 0;

	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		startX = x;
	}

	public void draw(Color oldColor, Graphics g) {
		g.setColor(oldColor);
		g.fillRect(oldX, y, width, height);

		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	}

	public void moveRight(int vel) {
		oldX = x;
		x += vel;
	}
	public void moveLeft(int vel) {
		oldX = x;
		x -= vel;
	}
	public boolean hitBall(int ballX, int ballY, int diam) {
		if(x <= ballX && ballX <= x + width) {
			if(ballY + diam >= y) {
				hitCount++;
				return true;
			}
		}
		return false;
	}
	public void resetPaddle() {
		x = startX;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public int getHitCount() {
		return hitCount;
	}

	
}
