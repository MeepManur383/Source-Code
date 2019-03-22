package ashwin.manur.APCSA.hw.Chapter8;

import java.util.Scanner;
public class Exercise4 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Enter the date(mm/dd/yyyy): ");
		String dateStr = kboard.nextLine();
		System.out.print(dateSwap(dateStr));
		kboard.close();
	}
	public static String dateSwap(String dateStr) {
		dateStr = dateStr.replace('/', '-');
		System.out.println(dateStr);
		if(dateStr.length() > 8) {
			String swapped = dateStr.substring(dateStr.indexOf('-') + 1, dateStr.indexOf('-') + 3) + "-" + dateStr.substring(0, dateStr.indexOf('-')) + "-" + dateStr.substring(dateStr.length() - 4);
			return swapped;
		}
		else {
			String swapped = dateStr.substring(dateStr.indexOf('-') + 1, dateStr.indexOf('-') + 2) + "-" + dateStr.substring(0, dateStr.indexOf('-')) + "-" + dateStr.substring(dateStr.length() - 4);
			return swapped;
		}
			
	}
}
