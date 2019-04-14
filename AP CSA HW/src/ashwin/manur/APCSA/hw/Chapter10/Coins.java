package ashwin.manur.APCSA.hw.Chapter10;

public class Coins {
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	
	public Coins(int cents) {
		quarters = cents / 25;
		cents -= quarters * 25;
		dimes = cents / 10;
		cents -= dimes * 10;
		nickels = cents / 5;
		cents -= nickels * 5;
		pennies = cents;
	}
	
	public int getQuarters() {
		return quarters;
	}
	public int getDimes() {
		return dimes;
	}
	public int getNickels() {
		return nickels;
	}
	public int getPennies() {
		return pennies;
	}

}
