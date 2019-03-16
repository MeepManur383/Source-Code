package ashwin.manur.APCSA.hw.Chapter7;

import java.util.Scanner;

public class PiCalculator {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter how many times do you want to refine pi: ");
		int times = kboard.nextInt();
		System.out.println(calcPi(times));
		kboard.close();
	}
	public static double calcPi(int times) {
		double pi = 1;
		int d = 1;
		for(int i = 3; i < times + 3; i++) {
			d+=2;
			if(i % 2 == 0) {
				pi += (1.0 / (d));
			}
			if(i % 2 != 0) {
				pi -= (1.0 / (d));
			}
		}
		return pi * 4;
	}
}
