package ashwin.manur.APCSA.hw.Chapter8;

public class Exercise8 {
	public static void main(String[] args) {
		System.out.print(negate("10110100011101000101011"));

	}
	public static String negate(String temp) {
		if(temp == null)
			return null;

		temp = temp.replace('0', '*');
		temp = temp.replace('1', '0');
		temp = temp.replace('*', '1');
		return temp;
	}
}
