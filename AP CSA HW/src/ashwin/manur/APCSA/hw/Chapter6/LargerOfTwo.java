package ashwin.manur.APCSA.hw.Chapter6;

public class LargerOfTwo {
	public static void Main(String[] args) {
		System.out.println(max(9, 8));
	}
	public static int max(int x, int y) {
		if(x > y) {
			return x;
		}	
		else {
			return y;
		}	
	}
}
