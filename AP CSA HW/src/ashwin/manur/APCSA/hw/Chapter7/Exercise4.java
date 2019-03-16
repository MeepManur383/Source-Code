package ashwin.manur.APCSA.hw.Chapter7;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter an integer >= 0: ");
		int m = kboard.nextInt();
		System.out.print("Enter another integer >= 0: ");
		int n = kboard.nextInt();
		System.out.println(QAndR(m, n));
		kboard.close();

	}
	public static String QAndR(int m, int n) {
		int quotient = 0;
		int remainder = 0;
		while(m >= n && n != 0) {
			m -= n;
			quotient++;
		}
		remainder = m;
		return ("Quotient is: " + quotient + " and remainder is " + remainder);
	}
}
