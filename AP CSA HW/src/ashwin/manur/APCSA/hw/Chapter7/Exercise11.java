package ashwin.manur.APCSA.hw.Chapter7;

import java.util.Scanner;

public class Exercise11 {
	public static boolean isPerfectSquare(int n) {
		return true;
	}
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.println("Enter an int >= 1: ");
		int n = kboard.nextInt();
		System.out.println( isPerfectSquare(n));
		kboard.close();
	}

}
