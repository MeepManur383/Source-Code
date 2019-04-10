package ashwin.manur.APCSA.hw.Chapter9;
import java.util.Scanner;
public class ExtraCreditKnapsack {
	public static String maxWeights(int w1, int w2, int limit) {
		if(limit < w1 && limit < w2) {
			return "None fit!";
		}
		while(w1 + w2 > limit && w1 > 0) {
				w1--;
		}
		while(w1 + w2 > limit && w2 > 0) {
			w2--;
		}
//		int count = 0;
//		while(w1 + w2 > limit && (w1 > 0 && w2 > 0)) {
//			if(count % 2 == 0)
//				w1--;
//			else
//				w2--;
//		}

		return ("Limit = " + limit + ": Weight 1 = " + w1 + ", and Weight 2 = " + w2 + ": Weight 1 + Weight 2 = " + (w1 + w2));
		
	}
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Enter weight one: ");
		int w1 = k.nextInt();
		System.out.println("Enter weight two: ");
		int w2 = k.nextInt();
		System.out.println("Enter weight limit: ");
		int lim = k.nextInt();
		System.out.print(maxWeights(w1, w2, lim));
		k.close();
	}
}
