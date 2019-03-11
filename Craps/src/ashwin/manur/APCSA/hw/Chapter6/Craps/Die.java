package ashwin.manur.APCSA.hw.Chapter6.Craps;

public class Die {
	
	private int rollValue;
	public void roll() {
		rollValue = (int)(Math.random() * 6 + 1);
	}
	
	public int getNumDots() {
		return rollValue;
	}
}
