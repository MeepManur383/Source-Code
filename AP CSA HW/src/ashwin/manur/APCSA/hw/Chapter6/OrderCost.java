package ashwin.manur.APCSA.hw.Chapter6;

import java.util.Scanner;

public class OrderCost {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.println("Enter the number of Best Prepared books: ");
		int bp = kboard.nextInt();
		System.out.println("Enter the number of Next Best books ");
		int nb = kboard.nextInt();
		System.out.println("$" + getOrderTotal(bp, nb));
		kboard.close();
	}

	public static double getOrderTotal(int bp, int nb) {
		if(bp == 1 && nb == 1) {
			return 39.95;
		}
		
		if((bp + nb) >= 12) {
			return (bp + nb) * 16;
		}
		if((bp + nb) >= 3) {
			return (bp + nb) * 16.95;
		}
		return bp * 20.95 + nb * 21.95;
	}
}