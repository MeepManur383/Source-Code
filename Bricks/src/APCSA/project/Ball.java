package APCSA.project;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	private int diam = 20;
	private int x;
	private int y;
	private int oldX;
	private int oldY;
	private int xVel;
	private int yVel;
	private int centerX;
	private int paddleY;
	private int playWidth;
	private int frameHeight;
	private int wallWidth;
	private boolean outOfBounds;
	private boolean wallBounce;
	private int oldXVel;
	private int oldYVel;

	enum BounceDirection {
		LATERAL, VERTICAL, NONE
	}

	public Ball(int x, int y, int playWidth, int frameHeight, int wallWidth, int paddleY) {
		this.x = x;
		this.y = y;
		this.playWidth = playWidth;
		this.frameHeight = frameHeight;
		this.wallWidth = wallWidth;
		this.paddleY = paddleY;
		centerX = (playWidth - wallWidth) / 2;
	}

	public void draw(Color oldColor, Graphics g) {

		g.setColor(oldColor);
		g.fillOval(oldX, oldY, diam, diam);
		if (!outOfBounds()) {
			g.setColor(Color.green);
			g.fillOval(x, y, diam, diam);
		}
	}

	public void wallBounce() {
		if (x >= playWidth - wallWidth - diam || x <= 15) {
			bounceLateral();
			wallBounce = true;
		}
		if (y <= wallWidth + 20) {
			bounceVertical();
			wallBounce = true;
		}
		wallBounce = false;
	}

	public void move() {
		oldX = x;
		oldY = y;
		wallBounce();
		x += xVel;
		y += yVel;
	}

	public boolean outOfBounds() {
		if (y > frameHeight - 2) {
			outOfBounds = true;
			return true;
		} else {
			return false;
		}

	}

	public void stageBall() {
		xVel = 0;
		yVel = 0;
		x = centerX;
		y = paddleY - diam;
	}

	public void startBall(int xVel) {
		this.xVel = xVel;
		yVel = -4;
	}

	public void bounceLateral() {
		xVel = -xVel;
		int randBoost = (int) (Math.random() * 10);

		if (xVel < 0 && xVel > -6) {
			if ((randBoost == 7 || randBoost == 8) && xVel > -3) {
				xVel++;
			} if(randBoost == 0 || randBoost == 1) {
				xVel--;
			}
		}
		if (xVel > 0 && xVel < 6) {
			if ((randBoost == 7 || randBoost == 8) && xVel > 3) {
				xVel--;
			} if(randBoost == 0 || randBoost == 1) {
				xVel++;
			}
		}

	}

	public void bounceVertical() {
		yVel = -yVel;
		int randBoost = (int) (Math.random() * 6);
		if (yVel < 0 && yVel > -6) {
			if ((randBoost == 7 || randBoost == 8) && yVel > -3) {
				yVel++;
			} if(randBoost == 0 || randBoost == 1) {
				yVel--;
			}
		}
		if (yVel > 0 && yVel < 6) {
			if ((randBoost == 7 || randBoost == 8) && yVel > 3) {
				yVel--;
			} if(randBoost == 0 || randBoost == 1) {
				yVel++;
			}
		}

	}

	public void pause() {
		oldXVel = xVel;
		oldYVel = yVel;
		xVel = 0;
		yVel = 0;
	}

	public void resume() {
		xVel = oldXVel;
		yVel = oldYVel;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDiam() {
		return diam;
	}

	public int getXVel() {
		return xVel;
	}

	public int getYVel() {
		return yVel;
	}

	public void setXVel(int xVel) {
		this.xVel = xVel;
	}

	public void setYVel(int yVel) {
		this.yVel = yVel;
	}

}