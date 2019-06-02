package APCSA.project;

import APCSA.project.Brick.BrickSide;

public class Test {
	public static void testContact(int myX, int myY, int ballX, int ballY, boolean intact, int width, int height) {

		if(!intact) {
			System.out.println("none");
			System.exit(0);
		}
		
		int xDist = 0;
		int yDist = 0;
		if(ballX < myX || ballX > myX + width) {
			System.out.println("none");
			System.exit(0);
		}
		if(ballY < myY || ballY > myY + height) {
			System.out.println("none");
			System.exit(0);

		}
		if(myX <= ballX && ballX <= myX + width / 2) {
			xDist = Math.abs(ballX - myX);
		}
		else {
			xDist = ballX - (myX + width);
		}
		if(myY <= ballY && ballY <= myY + height / 2) {
			yDist = Math.abs(ballY - myY);
		}
		else {
			yDist = ballY - (myY + height);
		}

		if(xDist >= 0 && xDist < yDist) {
			System.out.println("left");
			System.exit(0);

		}
		if(xDist < 0 && xDist > yDist) {
			System.out.println("right");
			System.exit(0);

		}
		if(yDist >= 0 && yDist < xDist) {
			System.out.println("top");
			System.exit(0);

		}
		else {
			System.out.println("bottom");
			System.exit(0);

		}
	}
	public static void main(String[] args) {
		//testContact(10, 10, 1, 18, true, 30, 20);
		int randBoost = (int)(Math.random() * 5) - 2;
		System.out.println(randBoost);

	}

}