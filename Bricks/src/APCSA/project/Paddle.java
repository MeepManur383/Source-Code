package APCSA.project;
import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
	private int width;
	private int height;
	private int x;
	private int y;
	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	}
	
}
