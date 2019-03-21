package ashwin.manur.APCSA.hw.Chapter7;

import java.util.Scanner;

public class Exercise24 {
	public static final double price = 0.26;

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		while (true) {
			String str;

			System.out.print("Enter quantity: ");
			int quantity = kboard.nextInt();
			kboard.nextLine(); // skip the rest of the line

			if (quantity % 25 != 0)
				System.out.println("Ripples can be ordered only in packs of 25");
			else
				System.out.printf("You have ordered %d Ripples -- $%.2f\n\n", quantity, price * quantity);

			char answer;
			do {
				System.out.print("Next Customer (y/n): ");
				str = kboard.nextLine().trim();
				if (str.length() == 1)
					answer = str.charAt(0);
				else
					answer = ' ';

			} while (answer != 'n' && answer != 'y');

			if (answer == 'n') {
				System.out.print("Thank you for using Ripple Systems.");
				break;
			}

		}
		kboard.close();

	}
}
