package APCSA.project;
import java.awt.Color;
import java.awt.Graphics;

public class Ball{
	private int diam;
	private int x;
	private int y;
	private int oldX;
	private int oldY;
	
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void draw(Graphics g) {
		g.setColor(Color.lightGray);
		g.fillOval(x, y, diam, diam);
      g.setColor(Color.black);
      g.fillOval(oldX, oldY, diam, diam);			
	}
	
	public void move(int newX, int newY) {
		oldX = x;
		oldY = y;
		x = newX;
		y = newY;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getOldX() {
		return oldX;
	}
	public int getOldY() {
		return oldY;
	}
	public int getDiam() {
		return diam;
	}   
   
}