package APCSA.project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class TextFunctions {

	private String text;
	private int frameWidth;
	private int frameHeight;
	private int playWidth;
	
	public TextFunctions(int frameWidth, int frameHeight, int playWidth) {
		this.frameWidth = frameWidth;
		this.frameHeight = frameHeight;
		this.playWidth = playWidth;
	}
	
	public void display(Graphics g, String newText, int x, int y, Color color, int fontSize) {
		Font thisFont = new Font("brick font", 1, fontSize);
		g.setFont(thisFont);
		g.setColor(color);
		g.drawString(newText, x, y);
	}
	
	public void displayGameOver(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, frameWidth, frameHeight);
		g.setColor(Color.white);
		Font myFont = new Font("brick font", 1, 30);
		g.setFont(myFont);
		g.drawString("GAME OVER", frameWidth / 2 - 85, frameHeight / 2 + 15);
	}
	
	public void displayCongrats(Graphics g, int score) {
		g.setColor(Color.green);
		g.fillRect(0, 0, frameWidth, frameHeight);
		Font myFont = new Font("brick font", 1, 30);
		g.setFont(myFont);
		g.setColor(Color.white);
		g.drawString("Congratulations", frameWidth / 2 - 110, frameHeight / 2 - 15);
		g.drawString("Final Score: " + score, frameWidth / 2 - 110, frameHeight / 2 + 20);

	}
	
	public void displayRules(Graphics g) {
		Font myFont = new Font("brick font", 1, 17);
		g.setFont(myFont);
		g.setColor(Color.white);
		g.drawString("Rules and Tips", playWidth + 12, 200);
		g.setColor(Color.red);
		g.drawString("If you break all bricks", playWidth + 12, 225);
		g.drawString("you win!", playWidth + 12, 250);
		g.drawString("If you run out of", playWidth + 12, 275);
		g.drawString("lives you lose ):", playWidth + 12, 300);
		g.drawString("Launch the ball using arrow", playWidth + 12, 325);
		g.drawString("keys.", playWidth + 12, 350);
		g.drawString("Control the paddle using ", playWidth + 12, 375);
		g.drawString("arrow keys.", playWidth + 12, 400);
		g.drawString("The higher the bricks,", playWidth + 12, 425);
		g.drawString("the higher the value.", playWidth + 12, 450);
		g.setColor(Color.yellow);
		g.drawString("Good Luck!", playWidth + 12, 475);
		g.drawString("Ashwin Manur and Jay Patel", playWidth + 32, 740);

	}
	public void displayPause(Graphics g, Color color, boolean paused) {
		Font myFont = new Font("brick font", 1, 30);
		g.setFont(myFont);
		if(paused) {
			g.setColor(Color.red);
		}
		else {
			g.setColor(color);
		}
		g.drawString("Game Paused", playWidth + 12, 625);
	}
	public void reset(Graphics g, Color color) {
		Font myFont = new Font("brick font", 1, 30);
		g.setFont(myFont);
		g.setColor(color);
		g.fillRect(15, 15, playWidth, frameHeight - 15);
	}
}
