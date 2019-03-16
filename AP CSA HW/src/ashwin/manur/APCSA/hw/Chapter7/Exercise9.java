package ashwin.manur.APCSA.hw.Chapter7;

import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter an integer < 10: ");
		int n = kboard.nextInt();
		int sum = 0;
		for(int  i = 1; i <= n; i++) {
			if(i == n) {
				System.out.print(i + " = ");
				sum += i;
			}
			else{
				System.out.print(i + " + ");
				sum += i;
			}
			
		}
		System.out.print( + sum);
		kboard.close();
	}

}
