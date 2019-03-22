package ashwin.manur.APCSA.hw.Chapter8;

import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter ur social security number: ");
		String ssNum = kboard.nextLine();
		System.out.println(removeDashes(ssNum));
		kboard.close();
	}
	public static String removeDashes(String ssNum) {
		return ssNum.substring(0,ssNum.indexOf('-')) + ssNum.substring(ssNum.indexOf('-') + 1, 6) + ssNum.substring(ssNum.length() - 4);
	}

}
