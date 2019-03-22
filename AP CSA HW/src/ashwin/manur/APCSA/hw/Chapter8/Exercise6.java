package ashwin.manur.APCSA.hw.Chapter8;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = kboard.nextLine();
		System.out.println(scroll(word));
		kboard.close();
	}
	public static String scroll(String word) {
		return word.substring(1) + word.substring(0, 1);
	}

}
