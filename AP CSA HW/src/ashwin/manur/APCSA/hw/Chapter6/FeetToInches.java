package ashwin.manur.APCSA.hw.Chapter6;
import java.util.Scanner;
public class FeetToInches {
	public static void main (String args []) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("How many feet tall are you: ");
		int feet = kboard.nextInt();
		System.out.print("How many more inches than " + feet + " feet: " );
		double inches = kboard.nextDouble();
		toInches(feet, inches);

		kboard.close();

	}
	
	static void toInches(int feet, double inches) {
		double heightIn = feet * 12.0;
		heightIn += inches;
		System.out.println("You are " + heightIn + " inches tall.");
	}
}
