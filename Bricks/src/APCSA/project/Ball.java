package APCSA.project;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.*;
public class Ball extends JPanel implements ActionListener{
	Timer timer = new Timer(50, this);
	private int diam = 20;
	private double x = 0;
	private double y = 0;
	private double velX = 2;
	private double velY = 2;
	private String[][] occPts;
	ArrayList<Brick> bricks;
	
	public Ball(ArrayList<Brick> bricks) {
		this.bricks = bricks;
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D circle = new Ellipse2D.Double(x, y, diam, diam);
		g2.fill(circle);
		timer.restart();
		
		
	}
	public void actionPerformed(ActionEvent e) {
		x += velX;
		y += velY;
		repaint();
	}
	public String[][] findOccPts() {
		String[][] points = new String[diam][diam];
		for(int r = 0; r < diam; r++) {
			for(int c = 0; c < diam; c++) {
				points[r][c] = "" + (x + r) + "," + (y + c);
			}
		}
		return points;
	}
	
	public boolean touchBrick() {
		occPts = findOccPts();
		double ballX;
		double ballY;
		double brickX;
		double brickY;
		String ballPt;
		String brickPt;
		for(int thisBrick = 0; thisBrick < bricks.size(); thisBrick++) {
			//brickPt = bricks.get(thisBrick).getOccPts();
			
			for(int r = 0; r < occPts.length; r++) {
				for(int c = 0; c < occPts[r].length; c++) {
					ballPt = occPts[r][c];
					ballX = Double.parseDouble(ballPt.substring(0, ballPt.indexOf(",")));
					ballY = Double.parseDouble(ballPt.substring(ballPt.indexOf(",") + 1));

				}
			}

		}
		
	}
}
