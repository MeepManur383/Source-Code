package ashwin.manur.APCSA.hw.Chapter6;

public class XOR {
	public static boolean XOR1(boolean x, boolean y) {
		if(x == false && y == false)
			return false;
		if(x == true && y == false)
			return true;
		if(x == false && y == true)
			return true;
		
		return false;
	}
	
	public static boolean XOR2(boolean x, boolean y) {
		return (x != y);
	}
	
	public static boolean XOR3(boolean x, boolean y) {
		if(x == y)
			return false;
		return true;
	}

	
	public static void main(String[] args) {
		System.out.println("XOR2(false, true) " + XOR2(false, true));
		System.out.println("XOR2(false, false) " + XOR2(false, false));
		System.out.println("XOR2(true, false) " + XOR2(true, false));
		System.out.println("XOR2(true, true) " + XOR2(true, true));

	}
}
