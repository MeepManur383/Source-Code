package ashwin.manur.APCSA.hw.Chapter7;

import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int n = kboard.nextInt();
		System.out.println("The sum of the digits is " + sumDigits(n));
		kboard.close();
	}

	public static int sumDigits(int n) {
		int sum = 0;
		for (int i = 0; n != 0; i++) {
			sum += n % 10;
			n /= 10;
		}
		return sum;

	}
}
