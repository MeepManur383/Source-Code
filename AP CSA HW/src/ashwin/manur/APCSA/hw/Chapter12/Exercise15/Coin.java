package ashwin.manur.APCSA.hw.Chapter12.Exercise15;

public class Coin implements Money{
	
	public double getAmount(){
		if(this instanceof Quarter)
			return 0.25;
		if(this instanceof Dime)
			return 0.1;
		if(this instanceof Nickel)
			return .05;
		return 0;
	}
}
