package ashwin.manur.APCSA.hw.Chapter12.Exercise15;

public class Bill implements Money{
	private int value;
	public Bill(int value){
		this.value = value;
	}
	public double getAmount(){
		return value;
	}	
	@Override
	public String toString(){
		return "$" + value;
	}
}
