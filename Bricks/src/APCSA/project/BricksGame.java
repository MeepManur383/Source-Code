package APCSA.project;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.Color;


public class BricksGame extends JFrame implements ActionListener{
	
	private int frameWidth = 1300;
	private int playWidth = 1000;
	private int frameHeight = 800;
	private int wallWidth = 15;
	
	private Ball ball;
	private Paddle paddle;
	private ArrayList<Brick> bricks;
    private int score;
	
	public BricksGame(Ball ball, Paddle paddle, ArrayList<Brick> bricks) {
		Timer t = new Timer(50, this);
		t.start();
		setBounds(100, 100, frameWidth, frameHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		getContentPane().setBackground(Color.black);

		this.ball = ball;
		this.paddle = paddle;
		this.bricks = bricks;
	}
	
	public void paint(Graphics g) {
		for(Brick brick : bricks) {
			if(brick.getState()) {
				brick.draw(g);
			}
		}
		ball.draw(g);
		paddle.draw(g);
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 15, frameHeight);
		g.fillRect(0, 0, frameWidth, wallWidth + 20);
		g.fillRect(playWidth - wallWidth,  0, wallWidth, frameHeight);
		g.fillRect(frameWidth - wallWidth, 0, wallWidth, frameHeight);
		g.fillRect(playWidth, frameHeight - wallWidth, 300, wallWidth);
	}
   
   public boolean brickContact(){
      for(Brick brick : bricks){
         if((ball.getX() == brick.getXPos() && ball.getY() == brick.getYPos()) || (ball.getX() + ball.getDiam() == brick.getXPos() && ball.getY() == brick.getYPos())
          || (ball.getX() == brick.getXPos() && ball.getY() + ball.getDiam() == brick.getYPos())
          || (ball.getX() + ball.getDiam() == brick.getXPos() && ball.getY() + ball.getDiam() == brick.getYPos())){
            score += brick.getValue();
            brick.hitBrick();
            if(!brick.getState()) {
            	score += brick.getValue();
            }
            return true;
          } 
      }
      return false;
   }
	
	public void actionPerformed(ActionEvent e) {
		int xVel = 5;
		int yVel = 5;
		if(((ball.getX() <= wallWidth || ball.getX()  + ball.getDiam() >= playWidth - wallWidth) || (ball.getY() <= wallWidth + 20))){
		  xVel = -xVel;
		  yVel = - yVel;
		}
      

		if(brickContact()) {
    	  xVel = -xVel;
    	  yVel = -yVel;
		}
        ball.move(ball.getX() + xVel, ball.getY() + yVel);
		

		repaint();
	}
	
	public static void main(String[] args) {
		Ball ball = new Ball(20, 20);
		Paddle paddle = new Paddle(375, 765, 250, 25);
		ArrayList<Brick> bricks = new ArrayList<Brick>(50);
		int brickVal = 50;
		int strength = 2;
		int xPos = 50;
		int yPos = 50;
		int brickWidth = 72;
		int brickHeight = 30;
		for(int r = 0; r < 5; r++) {
			for(int c = 0; c < 10; c++) {
				bricks.add(new Brick(strength, xPos, yPos, brickWidth, brickHeight, brickVal));
				xPos += brickWidth + 20;
			}
			xPos = 50;
			yPos += brickHeight + 20;
			brickVal -= 10;
			if(r > 1) {
				strength = 1;
			}
		}
		new BricksGame(ball, paddle, bricks);
	}
	
	
	
}