package ashwin.manur.APCSA.hw.Chapter7;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter an integer >= 0: ");
		int n = kboard.nextInt();
		System.out.println(sumOfOdd(n));
		kboard.close();
	}
	public static int sumOfOdd(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i+=2) {
			sum += (i);
		}
		return sum;
	}

}
