package ashwin.manur.APCSA.hw.Chapter6;

import java.util.Scanner;
public class LunchTime {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.println("Enter a time before 1:00 pm: ");
		String time = kboard.nextLine();
		int i = time.indexOf(":");
		int hours = Integer.parseInt(time.substring(0, i));
		int mins = Integer.parseInt(time.substring(i + 1));
		
		System.out.println("There are " + minutesUntilLunch(hours, mins) + " minutes until lunch.");
		
		kboard.close();
	}
	public static int minutesUntilLunch(int hours, int mins) {
		int tillLunch = 780 - (hours * 60 + mins);
		return tillLunch;
	}
}
