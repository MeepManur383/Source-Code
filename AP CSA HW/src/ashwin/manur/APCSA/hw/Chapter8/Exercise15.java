package ashwin.manur.APCSA.hw.Chapter8;

import java.util.Scanner;

public class Exercise15 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = kboard.nextLine();
		System.out.println(allNums(str));
		kboard.close();
	}
	public static boolean allNums(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) > '9' || str.charAt(i) < '0')
				return false;
		}
		return true;
	}
}
