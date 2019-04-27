package ashwin.manur.APCSA.hw.Chapter12;

public class MyPlace implements Place{
	private int lineValue;

	public MyPlace(int lineValue){
		this.lineValue = lineValue;
	}
	public int distance(Place other){
		if(other instanceof MyPlace){
			return Math.abs(lineValue - ((MyPlace) other).getLineValue());	
		}
		return -1;
	}
	public int getLineValue(){
		return lineValue;
	}
	
	
}
