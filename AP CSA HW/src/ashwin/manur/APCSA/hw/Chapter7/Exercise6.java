package ashwin.manur.APCSA.hw.Chapter7;

import java.util.Scanner;

public class Exercise6 {
	private static final int STARTYEAR = 2014;
	private static final double STARTPOPULATION = 123.8;
	private static final double RATE = .005;

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter a target population in millions: ");
		double target = kboard.nextDouble();
		System.out.println(tillTarget(target));
		kboard.close();

	}
	public static int tillTarget(double target) {
		int year = STARTYEAR;
		double population = STARTPOPULATION;
		while(population < target) {
			population *= (1 + RATE);
			year++;
		}
		return year;
	}
	

}
