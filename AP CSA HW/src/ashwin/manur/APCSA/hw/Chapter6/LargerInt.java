package ashwin.manur.APCSA.hw.Chapter6;

public class LargerInt {
	public static void main(String[] args) {

		System.out.println(max1(5, 6, 5));
		System.out.println(max2(5, 6, 5));
	}
	public static int max1(int x, int y, int z) {
		return Math.max(Math.max(x, y), z);
	}
	
	public static int max2(int x, int y, int z) {
		if(x > y && x > x)
			return x;
		if(y > x && y > z)
			return y;
		else
			return z;
	}
}
