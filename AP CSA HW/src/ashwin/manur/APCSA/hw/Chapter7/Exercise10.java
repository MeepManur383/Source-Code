package ashwin.manur.APCSA.hw.Chapter7;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = kboard.nextInt();
		System.out.println(isPrime(n));
		kboard.close();
	}

	public static boolean isPrime(int n) {
		boolean noFactors = true;
		if(n <= 1)
			return false;
		if(n == 2)
			return true;
		for (int m = 2; noFactors; m++) {
			if (m % 2 != 0 && m != 2) {
				if (m * m > n && n % 2 != 0)
					break;
				if (n % m == 0)
					noFactors = false;
			}
		}
		return noFactors;
	}

}
