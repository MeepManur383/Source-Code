package ashwin.manur.APCSA.hw.Chapter7;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter an integer >= 0: ");
		int a = kboard.nextInt();
		System.out.print("Enter another integer >= 0: ");
		int b = kboard.nextInt();
		System.out.print(multiply(a, b));
		kboard.close();

	}
	public static int multiply (int a, int b) {
		int product = 0;
		for(int i = 0; i < a; i++) {
			product += b;
		}
		return product;
	}
}
