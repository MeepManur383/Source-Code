package ashwin.manur.APCSA.hw.Chapter7;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = kboard.nextInt();
		printCheckerboard(n);
		kboard.close();
	}
	public static void printCheckerboard(int n) {
		int count = 0;
		for(int r = 0; r < n; r++) {
			for(int c = 0; c < n; c++) {
				//check if the character is even or odd numbered
				if(count % 2 == 0)
					System.out.print("#");
				else
					System.out.print("o");
				count++;

			}
			System.out.println();

		}
	}

}
