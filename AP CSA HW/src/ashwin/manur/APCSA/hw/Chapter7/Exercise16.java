package ashwin.manur.APCSA.hw.Chapter7;

import java.util.Scanner;

public class Exercise16 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = kboard.nextInt();
		System.out.print("Enter an integer: ");
		int b = kboard.nextInt();
		System.out.print(algorithm(n, b));
		kboard.close();
	}
	public static int algorithm(int n, int b) {
		for(int p = 1; p <= n; p *= b) {
			n -= p;
		}
		return n; 
	}

}
