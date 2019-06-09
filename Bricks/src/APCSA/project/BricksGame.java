package APCSA.project;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.event.KeyListener;
import APCSA.project.Brick.BrickSide;
import APCSA.project.Ball.BounceDirection;

public class BricksGame extends JFrame implements ActionListener, KeyListener {

	private int frameWidth = 1300;
	private int playWidth = 1000;
	private int frameHeight = 800;
	private int wallWidth = 15;
	private int centerFrame = (playWidth - wallWidth) / 2;
	private Graphics myGraphics;
	private Color backgroundColor;

	private boolean gameOver = false;
	private boolean gamePaused = false;
	private int lives = 2;
	private int score;
	private int brickCount;
	private Ball ball = new Ball(700, 600, playWidth, frameHeight, wallWidth, 765);
	private Paddle paddle = new Paddle(375, 765, 250, 25);
	private ArrayList<Brick> bricks = new ArrayList<Brick>();
	private TextFunctions text = new TextFunctions(frameWidth, frameHeight, playWidth);
	private boolean ballWaiting = false;
	private boolean level2;
	private EasySound beep = new EasySound("beep-23.wav");
//	private EasySound loseLife = new EasySound("fail-trombone-02.wav");
	private EasySound victory = new EasySound("Ta Da-SoundBible.com-1884170640.wav");
	private EasySound bounce = new EasySound("Bounce-SoundBible.com-12678623.wav");


	//Instantiates and draws all bricks
	public void fillBricks() {
		int brickVal = 50;
		int strength = 1;
		int xPos = 50;
		int yPos = 50;
		int brickWidth = 72;
		int brickHeight = 30;

		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 10; c++) {
				bricks.add(new Brick(strength, xPos, yPos, brickWidth, brickHeight, brickVal, Color.red));
				xPos += brickWidth + 20;
				brickCount++;
			}
			xPos = 50;
			yPos += brickHeight + 20;
			brickVal -= 10;
		}
	}

	/* to be worked on in future
	 * public void fillBricksLevel2() { int brickVal = 50; int strength = 2; int
	 * xPos = 50; int yPos = 50; int brickWidth = 72; int brickHeight = 30; Color
	 * maroon = new Color(120, 0 , 0);
	 * 
	 * for(int r = 0; r < 4; r++) { for(int c = 0; c < 4; c++) { bricks.add(new
	 * Brick(strength, xPos, yPos, brickWidth, brickHeight, brickVal, maroon)); xPos
	 * += brickWidth + 20; brickCount++; } xPos = 50; yPos += brickHeight + 20;
	 * brickVal -= 10; } xPos = 582; yPos = 50; brickVal = 50; for(int r = 0; r < 4;
	 * r++) { for(int c = 0; c < 4; c++) { bricks.add(new Brick(strength, xPos,
	 * yPos, brickWidth, brickHeight, brickVal, maroon)); xPos += brickWidth + 20;
	 * brickCount++; } xPos = 582; yPos += brickHeight + 20; brickVal -= 10; }
	 * 
	 * }
	 */
	public BricksGame() {
		fillBricks();
		ball.stageBall();
		ballWaiting = true;
		this.addKeyListener(this);
		setBounds(100, 100, frameWidth, frameHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		//Action Event called after timer runs out, and game repaints
		Timer t = new Timer(22, this);
		t.start();

	}

	//Draws all game pieces and other GUI elements, including text
	public void paint(Graphics g) {
		myGraphics = g;

		backgroundColor = getContentPane().getBackground();

		for (Brick brick : bricks) {
			brick.draw(backgroundColor, g);
		}
		ball.draw(backgroundColor, g);
		paddle.draw(backgroundColor, g);

		g.setColor(Color.yellow);
		g.fillRect(0, 0, 15, frameHeight);
		g.fillRect(0, 0, frameWidth, wallWidth + 20);
		g.fillRect(playWidth - wallWidth, 0, wallWidth, frameHeight);
		g.fillRect(frameWidth - wallWidth, 0, wallWidth, frameHeight);
		g.fillRect(playWidth, frameHeight - wallWidth, 300, wallWidth);
		g.setColor(Color.red);
		g.fillRect(wallWidth, frameHeight - wallWidth, playWidth - wallWidth, wallWidth);
		g.setColor(Color.blue);
		g.fillRect(playWidth, wallWidth + 20, 285, frameHeight - 2 * wallWidth - 20);
		text.display(g, "SCORE: " + score, playWidth + 12, wallWidth + 50, Color.yellow, 25);
		text.displayRules(g);
		text.display(g, "Horizontal Speed: " + ball.getXVel(), playWidth + 12, 600, Color.yellow, 25);
		text.display(g, "Vertical Speed: " + ball.getYVel(), playWidth + 12, 625, Color.yellow, 25);

		if (!gameOver()) {
			text.display(g, "Lives Remaining: " + lives, playWidth + 12, wallWidth + 100, Color.pink, 25);
		} else {
			text.displayGameOver(g);
			//loseLife.play();
			gameOver = true;
		}
		if (!gameOver && brickCount <= 0) {
			text.displayCongrats(g, score);
			victory.play();
			/*
			 * try { Thread.sleep(2000); } catch (InterruptedException ex) {
			 * Thread.currentThread().interrupt(); } level2 = true;
			 */		}

	}

	public boolean gameOver() {
		gameOver = lives < 0;
		return gameOver;
	}

	//Checks if the ball hits any of the bricks
	public BounceDirection bricksAvoided() {

		for (Brick brick : bricks) {
			BrickSide brickSide = brick.brickContact(ball.getX(), ball.getY());
			if (brickSide != BrickSide.NONE) {
				score += brick.getValue();
				brick.hitBrick();
				beep.play();
				brickCount--;
			}
			if (brickSide == BrickSide.LEFT || brickSide == BrickSide.RIGHT) {
				return BounceDirection.LATERAL;
			}
			if (brickSide == BrickSide.TOP || brickSide == BrickSide.BOTTOM) {
				return BounceDirection.VERTICAL;
			}
		}
		return BounceDirection.NONE;
	}


	public void actionPerformed(ActionEvent e) {
			
		/*to be worked on in future
		 * if(level2) { text.reset(myGraphics, backgroundColor); ball.stageBall();
		 * fillBricksLevel2(); lives = 2; }
		 */		
		if (gameOver()) {
			ball.stageBall();
			ballWaiting = true;
			text.displayGameOver(myGraphics);
		}
		if (brickCount <= 0) {
			ball.stageBall();
			//text.displayCongrats(myGraphics, score);
		}

		//If the ball gets past the paddle it is reset after a pause
		if (ball.outOfBounds() && !gameOver) {
			lives--;
			//loseLife.play();
			paddle.resetPaddle();
			ball.stageBall();
			ballWaiting = true;
			try {
				Thread.sleep(2000);
				// ball.startBall();
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}

		if(!gamePaused) {
			ball.move();
		}
		BounceDirection ballDirection = bricksAvoided();
		if (ballDirection == BounceDirection.LATERAL) {
			ball.bounceLateral();
		}
		if (ballDirection == BounceDirection.VERTICAL) {
			ball.bounceVertical();
		}

		if (paddle.hitBall(ball.getX(), ball.getY(), ball.getDiam())) {
			/*
			 * if(!ballWaiting) { bounce.play(); }
			 * 
			 */			ball.bounceVertical();
			
		}

		repaint();

	}
	
	public boolean ballOnPaddle() {
		if(paddle.getX() <= ball.getX() && ball.getX() <= paddle.getX() + paddle.getWidth()) {
			if(ball.getY() + ball.getDiam() >= paddle.getY()) {
				return true;
			}
		}
		return false;
	}

	//Allows control of the paddle by listening for the left and right arrow keys
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (paddle.getX() + paddle.getWidth() > playWidth - wallWidth) {
				paddle.setX(playWidth - wallWidth - paddle.getWidth());
			}

			else {
				paddle.moveRight(18);
			}
		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (paddle.getX() < wallWidth) {
				paddle.setX(wallWidth);
			}

			else {
				paddle.moveLeft(18);
			}

		}

		if (ballWaiting) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				ball.startBall(4);	
				}
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				ball.startBall(-4);
				}

			ballWaiting = false;

		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			ball.pause();
			gamePaused = true;
			text.displayPause(myGraphics, backgroundColor, gamePaused);
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			ball.resume();
			gamePaused = false;
			text.displayPause(myGraphics, backgroundColor, gamePaused);
		}


	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public static void main(String[] args) {

		new BricksGame();
	}

}