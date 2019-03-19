package ashwin.manur.APCSA.hw.Chapter7;

import java.util.Scanner;

public class Exercise20 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = kboard.nextInt();
		printStarTriangle(n);
		kboard.close();
	}
	public static void printStarTriangle(int n) {
		for(int r = 1; r <= n; r++) {
			for(int spaceCount = 0; spaceCount < n - r; spaceCount++) {
				System.out.print(" ");
			}
			for(int c = 0; c < (2*r - 1); c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
