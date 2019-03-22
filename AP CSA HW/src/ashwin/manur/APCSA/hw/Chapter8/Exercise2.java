package ashwin.manur.APCSA.hw.Chapter8;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter a string with or without '*' : ");
		String str = kboard.nextLine();
		System.out.println(endStar(str));
		System.out.println(end2Star(str));
		kboard.close();
	}
	public static boolean endStar(String str) {
		if(str.length() != 0 && str.charAt(str.length() - 1) == '*')
			return true;
		else
			return false;
	}
	public static boolean end2Star(String str) {
		if(str.length() >= 2 && str.charAt(str.length() - 2) == '*' && str.charAt(str.length() - 1) == '*')
			return true;
		else
			return false;

	}

}
